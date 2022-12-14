package com.example.feigncs2.controller;


import com.example.feigncs2.utill.FeignServiceCustomerUtil;
import com.example.feigncs2.utill.FeignServiceOrderUtil;
import com.example.feigncs2.utill.FeignServiceProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign-cs2")
public class FeignController {

    @Autowired
    private FeignServiceProductUtil feignServiceProductUtil;

    @GetMapping("/Products")
    public String getProdId(){
        return feignServiceProductUtil.getProdId();
    }

    @Autowired
    private FeignServiceCustomerUtil feignServiceCustomerUtil;

    @GetMapping("/Customers")
    public String getCstId(){
        return feignServiceCustomerUtil.getCstId();
    }

    @Autowired
    private FeignServiceOrderUtil feignServiceOrderUtil;

    @GetMapping("/Orders")
    public String getOrdId(){
        return feignServiceOrderUtil.getOdrId();
    }



}
