package com.remcarpediem.feignprotobuf.server.controller;


import com.remcarpediem.feignprotobuf.common.dto.HeaderReplyDTO;
import com.remcarpediem.feignprotobuf.dubbo.UserDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserDubboClientController {
    public static final int THREAD_NUM = 5;
    public static final int CALL_TIMES = 100000;

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private UserDubboService userDubboService;

    @RequestMapping("/testDubbo")
    public ResponseEntity testDubbo() {
        HeaderReplyDTO headerReply;
        Date beginDate = new Date();
        System.out.println("begin:" + beginDate);
        for (int i = 0; i < CALL_TIMES; i++) {
            headerReply = userDubboService.requestMessage("world:" + i);
            //System.out.println("name:" + headerReply.getField4());
        }
        Date endDate = new Date();
        System.out.println("end:" + endDate);

        System.out.println("time:" + (endDate.getTime() - beginDate.getTime()) / 1000 + " s");
        return ResponseEntity.ok().build();
    }
}
