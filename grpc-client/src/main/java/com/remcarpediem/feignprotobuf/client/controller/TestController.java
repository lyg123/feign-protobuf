package com.remcarpediem.feignprotobuf.client.controller;

import com.remcarpediem.feignprotobuf.grpc.dto.HeaderGrpc;
import com.remcarpediem.feignprotobuf.grpc.dto.HeaderReply;
import com.remcarpediem.feignprotobuf.grpc.dto.HeaderRequest;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    public static final int THREAD_NUM = 5;
    public static final int CALL_TIMES = 100000;

    @GrpcClient("grpc-user-service")
    private Channel serverChannel;


    @RequestMapping("/testGrpc")
    public ResponseEntity testGrpc() {
        HeaderReply headerReply;
        Date beginDate = new Date();
        System.out.println("begin:" + beginDate);
        HeaderGrpc.HeaderBlockingStub stub= HeaderGrpc.newBlockingStub(serverChannel);
        for (int i = 0; i < CALL_TIMES; i++) {
            headerReply = stub.requestMessage(HeaderRequest.newBuilder().setName("world:" + i).build());
            //System.out.println("name:" + headerReply.getField4());
        }
        //headerReply = stub.requestMessage(HeaderRequest.newBuilder().setName("world:").build());
        Date endDate = new Date();
        System.out.println("end:" + endDate);

        System.out.println("time:" + (endDate.getTime() - beginDate.getTime()) / 1000 + " s");
        return ResponseEntity.ok().build();
    }



}
