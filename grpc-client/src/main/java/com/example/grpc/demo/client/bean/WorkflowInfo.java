package com.example.grpc.demo.client.bean;

import lombok.Data;

import java.io.Serializable;
@Data
public class WorkflowInfo implements Serializable {
    private String requestId;
    private String workflowId;
    private String workflowName;
}
