package com.supplier.order.controller;

import com.supplier.api.commodity.itf.CommodityServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hai on 2018/6/18.
 */
@RestController
public class OrderController {

    @Autowired
    private CommodityServiceApi schedualServiceHi;

    @RequestMapping(value = "/order/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }




}
