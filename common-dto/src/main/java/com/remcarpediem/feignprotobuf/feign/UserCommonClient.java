package com.remcarpediem.feignprotobuf.feign;

import com.remcarpediem.feignprotobuf.common.dto.HeaderReplyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-common")
public interface UserCommonClient {

    @RequestMapping(value = "/replyProto2", method = RequestMethod.POST)
    HeaderReplyDTO requestMessage(@RequestParam("name") String name);
}
