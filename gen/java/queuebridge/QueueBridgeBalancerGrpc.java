package queuebridge;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: proto/queue-bridge.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueueBridgeBalancerGrpc {

  private QueueBridgeBalancerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "queuebridge.QueueBridgeBalancer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<queuebridge.QueueBridge.QueueMessage,
      queuebridge.QueueBridge.EmptyResponse> getPushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Push",
      requestType = queuebridge.QueueBridge.QueueMessage.class,
      responseType = queuebridge.QueueBridge.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<queuebridge.QueueBridge.QueueMessage,
      queuebridge.QueueBridge.EmptyResponse> getPushMethod() {
    io.grpc.MethodDescriptor<queuebridge.QueueBridge.QueueMessage, queuebridge.QueueBridge.EmptyResponse> getPushMethod;
    if ((getPushMethod = QueueBridgeBalancerGrpc.getPushMethod) == null) {
      synchronized (QueueBridgeBalancerGrpc.class) {
        if ((getPushMethod = QueueBridgeBalancerGrpc.getPushMethod) == null) {
          QueueBridgeBalancerGrpc.getPushMethod = getPushMethod =
              io.grpc.MethodDescriptor.<queuebridge.QueueBridge.QueueMessage, queuebridge.QueueBridge.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Push"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queuebridge.QueueBridge.QueueMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queuebridge.QueueBridge.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueBridgeBalancerMethodDescriptorSupplier("Push"))
              .build();
        }
      }
    }
    return getPushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<queuebridge.QueueBridge.PushBatchRequest,
      queuebridge.QueueBridge.EmptyResponse> getPushBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushBatch",
      requestType = queuebridge.QueueBridge.PushBatchRequest.class,
      responseType = queuebridge.QueueBridge.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<queuebridge.QueueBridge.PushBatchRequest,
      queuebridge.QueueBridge.EmptyResponse> getPushBatchMethod() {
    io.grpc.MethodDescriptor<queuebridge.QueueBridge.PushBatchRequest, queuebridge.QueueBridge.EmptyResponse> getPushBatchMethod;
    if ((getPushBatchMethod = QueueBridgeBalancerGrpc.getPushBatchMethod) == null) {
      synchronized (QueueBridgeBalancerGrpc.class) {
        if ((getPushBatchMethod = QueueBridgeBalancerGrpc.getPushBatchMethod) == null) {
          QueueBridgeBalancerGrpc.getPushBatchMethod = getPushBatchMethod =
              io.grpc.MethodDescriptor.<queuebridge.QueueBridge.PushBatchRequest, queuebridge.QueueBridge.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queuebridge.QueueBridge.PushBatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queuebridge.QueueBridge.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueBridgeBalancerMethodDescriptorSupplier("PushBatch"))
              .build();
        }
      }
    }
    return getPushBatchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueueBridgeBalancerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerStub>() {
        @java.lang.Override
        public QueueBridgeBalancerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueBridgeBalancerStub(channel, callOptions);
        }
      };
    return QueueBridgeBalancerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static QueueBridgeBalancerBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerBlockingV2Stub>() {
        @java.lang.Override
        public QueueBridgeBalancerBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueBridgeBalancerBlockingV2Stub(channel, callOptions);
        }
      };
    return QueueBridgeBalancerBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueueBridgeBalancerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerBlockingStub>() {
        @java.lang.Override
        public QueueBridgeBalancerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueBridgeBalancerBlockingStub(channel, callOptions);
        }
      };
    return QueueBridgeBalancerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueueBridgeBalancerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueBridgeBalancerFutureStub>() {
        @java.lang.Override
        public QueueBridgeBalancerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueBridgeBalancerFutureStub(channel, callOptions);
        }
      };
    return QueueBridgeBalancerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void push(queuebridge.QueueBridge.QueueMessage request,
        io.grpc.stub.StreamObserver<queuebridge.QueueBridge.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushMethod(), responseObserver);
    }

    /**
     */
    default void pushBatch(queuebridge.QueueBridge.PushBatchRequest request,
        io.grpc.stub.StreamObserver<queuebridge.QueueBridge.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushBatchMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueueBridgeBalancer.
   */
  public static abstract class QueueBridgeBalancerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueueBridgeBalancerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueueBridgeBalancer.
   */
  public static final class QueueBridgeBalancerStub
      extends io.grpc.stub.AbstractAsyncStub<QueueBridgeBalancerStub> {
    private QueueBridgeBalancerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueBridgeBalancerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueBridgeBalancerStub(channel, callOptions);
    }

    /**
     */
    public void push(queuebridge.QueueBridge.QueueMessage request,
        io.grpc.stub.StreamObserver<queuebridge.QueueBridge.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pushBatch(queuebridge.QueueBridge.PushBatchRequest request,
        io.grpc.stub.StreamObserver<queuebridge.QueueBridge.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushBatchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueueBridgeBalancer.
   */
  public static final class QueueBridgeBalancerBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<QueueBridgeBalancerBlockingV2Stub> {
    private QueueBridgeBalancerBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueBridgeBalancerBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueBridgeBalancerBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public queuebridge.QueueBridge.EmptyResponse push(queuebridge.QueueBridge.QueueMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushMethod(), getCallOptions(), request);
    }

    /**
     */
    public queuebridge.QueueBridge.EmptyResponse pushBatch(queuebridge.QueueBridge.PushBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushBatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service QueueBridgeBalancer.
   */
  public static final class QueueBridgeBalancerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueueBridgeBalancerBlockingStub> {
    private QueueBridgeBalancerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueBridgeBalancerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueBridgeBalancerBlockingStub(channel, callOptions);
    }

    /**
     */
    public queuebridge.QueueBridge.EmptyResponse push(queuebridge.QueueBridge.QueueMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushMethod(), getCallOptions(), request);
    }

    /**
     */
    public queuebridge.QueueBridge.EmptyResponse pushBatch(queuebridge.QueueBridge.PushBatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushBatchMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueueBridgeBalancer.
   */
  public static final class QueueBridgeBalancerFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueueBridgeBalancerFutureStub> {
    private QueueBridgeBalancerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueBridgeBalancerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueBridgeBalancerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<queuebridge.QueueBridge.EmptyResponse> push(
        queuebridge.QueueBridge.QueueMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<queuebridge.QueueBridge.EmptyResponse> pushBatch(
        queuebridge.QueueBridge.PushBatchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushBatchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUSH = 0;
  private static final int METHODID_PUSH_BATCH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUSH:
          serviceImpl.push((queuebridge.QueueBridge.QueueMessage) request,
              (io.grpc.stub.StreamObserver<queuebridge.QueueBridge.EmptyResponse>) responseObserver);
          break;
        case METHODID_PUSH_BATCH:
          serviceImpl.pushBatch((queuebridge.QueueBridge.PushBatchRequest) request,
              (io.grpc.stub.StreamObserver<queuebridge.QueueBridge.EmptyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPushMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              queuebridge.QueueBridge.QueueMessage,
              queuebridge.QueueBridge.EmptyResponse>(
                service, METHODID_PUSH)))
        .addMethod(
          getPushBatchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              queuebridge.QueueBridge.PushBatchRequest,
              queuebridge.QueueBridge.EmptyResponse>(
                service, METHODID_PUSH_BATCH)))
        .build();
  }

  private static abstract class QueueBridgeBalancerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueueBridgeBalancerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return queuebridge.QueueBridge.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueueBridgeBalancer");
    }
  }

  private static final class QueueBridgeBalancerFileDescriptorSupplier
      extends QueueBridgeBalancerBaseDescriptorSupplier {
    QueueBridgeBalancerFileDescriptorSupplier() {}
  }

  private static final class QueueBridgeBalancerMethodDescriptorSupplier
      extends QueueBridgeBalancerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueueBridgeBalancerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QueueBridgeBalancerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueueBridgeBalancerFileDescriptorSupplier())
              .addMethod(getPushMethod())
              .addMethod(getPushBatchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
