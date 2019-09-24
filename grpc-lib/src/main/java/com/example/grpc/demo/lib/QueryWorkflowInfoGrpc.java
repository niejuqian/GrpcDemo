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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: helloproto.proto")
public final class QueryWorkflowInfoGrpc {

  private QueryWorkflowInfoGrpc() {}

  public static final String SERVICE_NAME = "QueryWorkflowInfo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest,
      com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse> getQueryWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryWorkflow",
      requestType = com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest.class,
      responseType = com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest,
      com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse> getQueryWorkflowMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest, com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse> getQueryWorkflowMethod;
    if ((getQueryWorkflowMethod = QueryWorkflowInfoGrpc.getQueryWorkflowMethod) == null) {
      synchronized (QueryWorkflowInfoGrpc.class) {
        if ((getQueryWorkflowMethod = QueryWorkflowInfoGrpc.getQueryWorkflowMethod) == null) {
          QueryWorkflowInfoGrpc.getQueryWorkflowMethod = getQueryWorkflowMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest, com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "QueryWorkflowInfo", "QueryWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryWorkflowInfoMethodDescriptorSupplier("QueryWorkflow"))
                  .build();
          }
        }
     }
     return getQueryWorkflowMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryWorkflowInfoStub newStub(io.grpc.Channel channel) {
    return new QueryWorkflowInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryWorkflowInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryWorkflowInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryWorkflowInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryWorkflowInfoFutureStub(channel);
  }

  /**
   */
  public static abstract class QueryWorkflowInfoImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryWorkflow(com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryWorkflowMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryWorkflowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest,
                com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse>(
                  this, METHODID_QUERY_WORKFLOW)))
          .build();
    }
  }

  /**
   */
  public static final class QueryWorkflowInfoStub extends io.grpc.stub.AbstractStub<QueryWorkflowInfoStub> {
    private QueryWorkflowInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryWorkflowInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryWorkflowInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryWorkflowInfoStub(channel, callOptions);
    }

    /**
     */
    public void queryWorkflow(com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryWorkflowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueryWorkflowInfoBlockingStub extends io.grpc.stub.AbstractStub<QueryWorkflowInfoBlockingStub> {
    private QueryWorkflowInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryWorkflowInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryWorkflowInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryWorkflowInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse queryWorkflow(com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryWorkflowMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueryWorkflowInfoFutureStub extends io.grpc.stub.AbstractStub<QueryWorkflowInfoFutureStub> {
    private QueryWorkflowInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryWorkflowInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryWorkflowInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryWorkflowInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse> queryWorkflow(
        com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryWorkflowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_WORKFLOW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryWorkflowInfoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryWorkflowInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_WORKFLOW:
          serviceImpl.queryWorkflow((com.example.grpc.demo.lib.GrpcHelloProto.QueryRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.demo.lib.GrpcHelloProto.QueryResponse>) responseObserver);
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

  private static abstract class QueryWorkflowInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryWorkflowInfoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.demo.lib.GrpcHelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryWorkflowInfo");
    }
  }

  private static final class QueryWorkflowInfoFileDescriptorSupplier
      extends QueryWorkflowInfoBaseDescriptorSupplier {
    QueryWorkflowInfoFileDescriptorSupplier() {}
  }

  private static final class QueryWorkflowInfoMethodDescriptorSupplier
      extends QueryWorkflowInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryWorkflowInfoMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryWorkflowInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryWorkflowInfoFileDescriptorSupplier())
              .addMethod(getQueryWorkflowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
