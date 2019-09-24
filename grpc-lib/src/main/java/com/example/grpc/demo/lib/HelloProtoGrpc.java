package com.example.grpc.demo.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeter service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: helloproto.proto")
public final class HelloProtoGrpc {

  private HelloProtoGrpc() {}

  public static final String SERVICE_NAME = "HelloProto";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest,
      com.example.grpc.demo.lib.GrpcHelloProto.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest.class,
      responseType = com.example.grpc.demo.lib.GrpcHelloProto.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest,
      com.example.grpc.demo.lib.GrpcHelloProto.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest, com.example.grpc.demo.lib.GrpcHelloProto.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = HelloProtoGrpc.getSayHelloMethod) == null) {
      synchronized (HelloProtoGrpc.class) {
        if ((getSayHelloMethod = HelloProtoGrpc.getSayHelloMethod) == null) {
          HelloProtoGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest, com.example.grpc.demo.lib.GrpcHelloProto.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HelloProto", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.lib.GrpcHelloProto.HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloProtoMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloProtoStub newStub(io.grpc.Channel channel) {
    return new HelloProtoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloProtoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloProtoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloProtoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloProtoFutureStub(channel);
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static abstract class HelloProtoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.demo.lib.GrpcHelloProto.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest,
                com.example.grpc.demo.lib.GrpcHelloProto.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class HelloProtoStub extends io.grpc.stub.AbstractStub<HelloProtoStub> {
    private HelloProtoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloProtoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloProtoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloProtoStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.demo.lib.GrpcHelloProto.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class HelloProtoBlockingStub extends io.grpc.stub.AbstractStub<HelloProtoBlockingStub> {
    private HelloProtoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloProtoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloProtoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloProtoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.example.grpc.demo.lib.GrpcHelloProto.HelloReply sayHello(com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeter service definition.
   * </pre>
   */
  public static final class HelloProtoFutureStub extends io.grpc.stub.AbstractStub<HelloProtoFutureStub> {
    private HelloProtoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloProtoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloProtoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloProtoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.demo.lib.GrpcHelloProto.HelloReply> sayHello(
        com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloProtoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloProtoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.example.grpc.demo.lib.GrpcHelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.demo.lib.GrpcHelloProto.HelloReply>) responseObserver);
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

  private static abstract class HelloProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloProtoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.demo.lib.GrpcHelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloProto");
    }
  }

  private static final class HelloProtoFileDescriptorSupplier
      extends HelloProtoBaseDescriptorSupplier {
    HelloProtoFileDescriptorSupplier() {}
  }

  private static final class HelloProtoMethodDescriptorSupplier
      extends HelloProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloProtoMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloProtoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloProtoFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
