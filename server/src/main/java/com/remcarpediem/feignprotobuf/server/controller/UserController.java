package com.remcarpediem.feignprotobuf.server.controller;


import com.google.protobuf.util.Timestamps;
import com.remcarpediem.feignprotobuf.feign.UserClient;
import com.remcarpediem.feignprotobuf.proto.dto.DistributionReply;
import com.remcarpediem.feignprotobuf.proto.dto.HeaderReply;
import com.remcarpediem.feignprotobuf.proto.dto.LineReply;
import com.remcarpediem.feignprotobuf.proto.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController implements UserClient {
    private String host = "http://xxx/user/";

    @Override
    public UserDTO getUserInfo(@RequestParam("id") Long id) {
        return UserDTO.newBuilder().
                setId(id.intValue()).setName("Tom").
                setUrl(host + "Tom").build();
    }


    @Override
    public HeaderReply requestMessage(@RequestParam("name") String name) {
        List<LineReply> lineReplyList = new ArrayList<LineReply>();
        for (int i = 0; i < 10; i++) {
            List<DistributionReply> distributionReplyList = new ArrayList<DistributionReply>();
            for (int j = 0; j < 10; j++) {
                DistributionReply distributionReply = DistributionReply.newBuilder().setField1("我是第一列").setField2(2).
                        setField3(Timestamps.fromMillis(System.currentTimeMillis())).setField4("我是第四列").setField5(5).setField6("我是第六列").
                        setField7(7).setField8("我是第八列").setField9(9).setField10("我是第十列").
                        setField11(11).setField12("我是第十二列").setField13(13).setField14("我是第十四列").
                        setField15(15).setField16("我是第十六列").setField17(17).setField18("我是第十八列").
                        build();
                distributionReplyList.add(distributionReply);
            }
            LineReply lineReply = LineReply.newBuilder().addAllField1(distributionReplyList).setField2(2).
                    setField3(Timestamps.fromMillis(System.currentTimeMillis())).setField4("我是第四列").setField5(5).setField6("我是第六列").
                    setField7(7).setField8("我是第八列").setField9(9).setField10("我是第十列").
                    setField11(11).setField12("我是第十二列").setField13(13).setField14("我是第十四列").
                    setField15(15).setField16("我是第十六列").setField17(17).setField18("我是第十八列").build();
            lineReplyList.add(lineReply);
        }
        HeaderReply headerReply = HeaderReply.newBuilder().addAllField1(lineReplyList).setField2(2).setField3(Timestamps.fromMillis(System.currentTimeMillis()))
                .setField4(name).setField5(5).setField6("我是第六列").
                        setField7(7).setField8("我是第八列").setField9(9).setField10("我是第十列").
                        setField11(11).setField12("我是第十二列").setField13(13).setField14("我是第十四列").
                        setField15(15).setField16("我是第十六列").setField17(17).setField18("我是第十八列").build();
        return headerReply;

    }
}
