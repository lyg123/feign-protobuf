package com.remcarpediem.feignprotobuf.dubbo;

import com.remcarpediem.feignprotobuf.common.dto.HeaderReplyDTO;

public interface UserDubboService {

    HeaderReplyDTO requestMessage(String name);
}
