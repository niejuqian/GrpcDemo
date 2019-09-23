package com.example.grpc.demo.client;

import com.example.grpc.demo.lib.Greeter;
import com.example.grpc.demo.lib.HelloProtoGrpc;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private Channel serverChannel;
    public String sendMessage(String name) {
        HelloProtoGrpc.HelloProtoBlockingStub stub= HelloProtoGrpc.newBlockingStub(serverChannel);
        Greeter.HelloReply response = stub.sayHello(Greeter.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}
