package com.remcarpediem.feignprotobuf.server.controller;


import com.remcarpediem.feignprotobuf.common.dto.DistributionReplyDTO;
import com.remcarpediem.feignprotobuf.common.dto.HeaderReplyDTO;
import com.remcarpediem.feignprotobuf.common.dto.LineReplyDTO;
import com.remcarpediem.feignprotobuf.dubbo.UserDubboService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(version = "1.0.0")
public class UserDubboServiceImpl implements UserDubboService {


    public HeaderReplyDTO requestMessage(String name) {
        List<LineReplyDTO> lineReplyList = new ArrayList<LineReplyDTO>();
        for (int i = 0; i < 10; i++) {
            List<DistributionReplyDTO> distributionReplyList = new ArrayList<DistributionReplyDTO>();
            for (int j = 0; j < 10; j++) {
                DistributionReplyDTO distributionReply = new DistributionReplyDTO();
                distributionReply.setField1("我是第一列");
                distributionReply.setField2(2);
                distributionReply.
                        setField3(new Date());
                distributionReply.setField4("我是第四列");
                distributionReply.setField5(5);
                distributionReply.setField6("我是第六列");
                distributionReply.
                        setField7(7);
                distributionReply.setField8("我是第八列");
                distributionReply.setField9(9);
                distributionReply.setField10("我是第十列");
                distributionReply.
                        setField11(11);
                distributionReply.setField12("我是第十二列");
                distributionReply.setField13(13);
                distributionReply.setField14("我是第十四列");
                distributionReply.
                        setField15(15);
                distributionReply.setField16("我是第十六列");
                distributionReply.setField17(17);
                distributionReply.setField18("我是第十八列");

                distributionReplyList.add(distributionReply);
            }
            LineReplyDTO lineReply = new LineReplyDTO();
            lineReply.setField1(distributionReplyList);
            lineReply.setField2(2);
            lineReply.
                    setField3(new Date());
            lineReply.setField4("我是第四列");
            lineReply.setField5(5);
            lineReply.setField6("我是第六列");
            lineReply.
                    setField7(7);
            lineReply.setField8("我是第八列");
            lineReply.setField9(9);
            lineReply.setField10("我是第十列");
            lineReply.
                    setField11(11);
            lineReply.setField12("我是第十二列");
            lineReply.setField13(13);
            lineReply.setField14("我是第十四列");
            lineReply.
                    setField15(15);
            lineReply.setField16("我是第十六列");
            lineReply.setField17(17);
            lineReply.setField18("我是第十八列");
            lineReplyList.add(lineReply);
        }
        HeaderReplyDTO headerReply = new HeaderReplyDTO();
        headerReply.setField1(lineReplyList);
        headerReply.setField2(2);
        headerReply.setField3(new Date());
        headerReply
                .setField4(name);
        headerReply.setField5(5);
        headerReply.setField6("我是第六列");
        headerReply.
                setField7(7);
        headerReply.setField8("我是第八列");
        headerReply.setField9(9);
        headerReply.setField10("我是第十列");
        headerReply.
                setField11(11);
        headerReply.setField12("我是第十二列");
        headerReply.setField13(13);
        headerReply.setField14("我是第十四列");
        headerReply.
                setField15(15);
        headerReply.setField16("我是第十六列");
        headerReply.setField17(17);
        headerReply.setField18("我是第十八列");
        return headerReply;
    }
}
