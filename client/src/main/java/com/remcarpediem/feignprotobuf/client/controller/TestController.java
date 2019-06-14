package com.remcarpediem.feignprotobuf.client.controller;

import com.remcarpediem.feignprotobuf.common.dto.HeaderReplyDTO;
import com.remcarpediem.feignprotobuf.feign.UserClient;
import com.remcarpediem.feignprotobuf.feign.UserCommonClient;
import com.remcarpediem.feignprotobuf.proto.dto.HeaderReply;
import com.remcarpediem.feignprotobuf.proto.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {
    @Autowired
    private UserClient userClient;
    @Autowired
    private UserCommonClient userCommonClient;
    @PostMapping("/user")
    public String getUserInfo() {
        UserDTO userDTO = userClient.getUserInfo(1L);
        return userDTO.getName();
    }

    public static final int THREAD_NUM = 5;
    public static final int CALL_TIMES = 100000;



    @RequestMapping("/testProto")
    public ResponseEntity testProto() {
        HeaderReply headerReply;
        Date beginDate = new Date();
        System.out.println("begin:" + beginDate);

        for (int i = 0; i < CALL_TIMES; i++) {
            headerReply = userClient.requestMessage("world:" + i);
            //System.out.println("name:" + headerReply.getField4());
        }

        Date endDate = new Date();
        System.out.println("end:" + endDate);

        System.out.println("time:" + (endDate.getTime() - beginDate.getTime()) / 1000 + " s");
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/testProto2")
    public ResponseEntity testProto2() {
        HeaderReplyDTO headerReply;
        Date beginDate = new Date();
        System.out.println("begin:" + beginDate);

        for (int i = 0; i < CALL_TIMES; i++) {
            headerReply = userCommonClient.requestMessage("world:" + i);
            //System.out.println("name:" + headerReply.getField4());
        }

        Date endDate = new Date();
        System.out.println("end:" + endDate);

        System.out.println("time:" + (endDate.getTime() - beginDate.getTime()) / 1000 + " s");
        return ResponseEntity.ok().build();
    }

}
