package com.example.grpc.demo.server;

import com.example.grpc.demo.lib.Greeter;
import com.example.grpc.demo.lib.HelloProtoGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@Slf4j
@GrpcService(GreeterService.class)
public class GreeterService extends HelloProtoGrpc.HelloProtoImplBase {
    @Override
    public void sayHello(Greeter.HelloRequest request, StreamObserver<Greeter.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final Greeter.HelloReply.Builder replyBuilder = Greeter.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        //log.info("Returning " +message);
        System.out.println("Returning " +message);
    }
}
