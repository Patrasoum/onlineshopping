package com.example.feigncs2.utill;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "customer-service-cs2",url = "http://localhost:3002/customers")
public interface FeignServiceCustomerUtil {

    @GetMapping("/Customers")
    String getCstId();
}
