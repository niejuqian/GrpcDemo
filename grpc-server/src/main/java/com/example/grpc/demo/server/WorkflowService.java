package com.example.grpc.demo.server;

import com.example.grpc.demo.lib.GrpcHelloProto;
import com.example.grpc.demo.lib.QueryWorkflowInfoGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

import java.util.Random;

@Slf4j
@GrpcService(WorkflowService.class)
public class WorkflowService extends QueryWorkflowInfoGrpc.QueryWorkflowInfoImplBase {

    @Override
    public void queryWorkflow(GrpcHelloProto.QueryRequest request, StreamObserver<GrpcHelloProto.QueryResponse> responseObserver) {
        log.info("====>>>requestId={}",request);
        String requestId = request.getRequestId();
        System.out.println("requestId="+ requestId);
        GrpcHelloProto.QueryResponse.Builder builder =  GrpcHelloProto.QueryResponse.newBuilder();
        builder.setWorkflowId("我是流程配置编号：" + new Random().nextInt(500));
        builder.setWorkflowName("东北-张三-报销付款：金额-1000");
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
