package com.toy.pbletter.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("pbuser")
public interface UserFeign {

    @GetMapping(value = "/api/v1/user/id")
    String getUid();

}
