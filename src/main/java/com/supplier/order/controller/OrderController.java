package com.supplier.order.controller;

import com.supplier.commons.bean.commodity.Goods;
import com.supplier.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Hai on 2018/6/18.
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order/getAllOrders",method = RequestMethod.GET)
    public List<Goods> getAllOrders(){
        return orderService.getAllOrders();
    }




}
