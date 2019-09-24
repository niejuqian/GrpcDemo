package com.example.grpc.demo.client;

import com.example.grpc.demo.client.bean.WorkflowInfo;
import com.example.grpc.demo.lib.GrpcHelloProto;
import com.example.grpc.demo.lib.HelloProtoGrpc;
import com.example.grpc.demo.lib.QueryWorkflowInfoGrpc;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        HelloProtoGrpc.HelloProtoBlockingStub stub= HelloProtoGrpc.newBlockingStub(serverChannel);
        GrpcHelloProto.HelloReply response = stub.sayHello(GrpcHelloProto.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }

    public WorkflowInfo queryWorkflow(String requestId) {
        QueryWorkflowInfoGrpc.QueryWorkflowInfoBlockingStub stub = QueryWorkflowInfoGrpc.newBlockingStub(serverChannel);
        GrpcHelloProto.QueryRequest.Builder requestBuilder = GrpcHelloProto.QueryRequest.newBuilder();
        requestBuilder.setRequestId(requestId);
        GrpcHelloProto.QueryResponse response = stub.queryWorkflow(requestBuilder.build());
        WorkflowInfo workflowInfo = new WorkflowInfo();
        workflowInfo.setRequestId(requestId);
        workflowInfo.setWorkflowId(response.getWorkflowId());
        workflowInfo.setWorkflowName(response.getWorkflowName());
        return workflowInfo;
    }
}
