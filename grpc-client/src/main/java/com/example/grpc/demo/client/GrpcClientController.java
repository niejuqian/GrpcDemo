package com.example.grpc.demo.client;

import com.example.grpc.demo.client.bean.WorkflowInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {
    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/say")
    public String printMessage(@RequestParam(defaultValue = "Michael") String name) {
        return grpcClientService.sendMessage(name);
    }

    @RequestMapping("/workflow/detail")
    public WorkflowInfo getWorkflowDetail(@RequestParam(defaultValue = "012983") String requestId) {
        return grpcClientService.queryWorkflow(requestId);
    }
}
