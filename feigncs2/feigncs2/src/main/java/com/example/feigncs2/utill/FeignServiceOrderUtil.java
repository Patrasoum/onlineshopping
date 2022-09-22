package com.example.feigncs2.utill;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "order-service-cs2",url = "http://localhost:3003/orders")
public interface FeignServiceOrderUtil {

    @GetMapping("/Orders")
    String getOdrId();
}
