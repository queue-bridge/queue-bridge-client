# queue-bridge-client
Client lib for queue bridge.

## Java
1. Install grpc deps.
```xml
<dependency>
  <groupId>io.grpc</groupId>
  <artifactId>grpc-bom</artifactId>
  <version>1.73.0</version>
  <type>pom</type>
  <scope>import</scope>
</dependency>
...
<dependency>
  <groupId>com.google.protobuf</groupId>
  <artifactId>protobuf-java</artifactId>
  <version>4.31.1</version>
</dependency>
```
2. Java example
```java
package com.example.queuebridge;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class QueueBridgeClient {
    private final ManagedChannel channel;
    private final QueueBridgeBalancerGrpc.QueueBridgeBalancerBlockingStub blockingStub;

    public QueueBridgeClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                        .usePlaintext()
                        .build();
        this.blockingStub = QueueBridgeBalancerGrpc.newBlockingStub(channel);
    }

    public void shutdown() {
        channel.shutdown();
    }

    public void push(String queueId, byte[] data) {
        QueueMessage req = QueueMessage.newBuilder()
                .setQueueId(queueId)
                .setMessage(com.google.protobuf.ByteString.copyFrom(data))
                .build();
        try {
            blockingStub.push(req);
            System.out.println("Push 成功");
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void pushBatch(String queueId, List<byte[]> datas) {
        PushBatchRequest.Builder batchBuilder = PushBatchRequest.newBuilder();
        for (byte[] d : datas) {
            batchBuilder.addMessages(
                QueueMessage.newBuilder()
                    .setQueueId(queueId)
                    .setMessage(com.google.protobuf.ByteString.copyFrom(d))
                    .build()
            );
        }
        try {
            blockingStub.pushBatch(batchBuilder.build());
            System.out.println("PushBatch 成功");
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public static void main(String[] args) {
        QueueBridgeClient client = new QueueBridgeClient("localhost", 50051);

        client.push("queue1", "hello".getBytes(StandardCharsets.UTF_8));
        client.pushBatch("queue1", List.of("a".getBytes(), "b".getBytes()));

        client.shutdown();
    }
}
```