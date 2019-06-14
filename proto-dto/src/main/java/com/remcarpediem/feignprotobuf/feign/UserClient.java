package com.remcarpediem.feignprotobuf.feign;

import com.remcarpediem.feignprotobuf.feign.conf.ProtoFeignConfiguration;
import com.remcarpediem.feignprotobuf.proto.dto.HeaderReply;
import com.remcarpediem.feignprotobuf.proto.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user", configuration = ProtoFeignConfiguration.class)
public interface UserClient {
    @RequestMapping(value = "/info", method = RequestMethod.GET,
            consumes = "application/x-protobuf", produces = "application/x-protobuf")
    UserDTO getUserInfo(@RequestParam("id") Long id);

    @RequestMapping(value = "/replyProto", method = RequestMethod.POST,
            consumes = "application/x-protobuf", produces = "application/x-protobuf")
    HeaderReply requestMessage(@RequestParam("name") String name);
}
