package com.supplier.order.service.impl;

import com.supplier.commons.bean.commodity.Goods;
import com.supplier.commons.itf.CommodityServiceApi;
import com.supplier.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

/**
 * Created by o-zhengzhenhai on 2018/11/29.
 *
 *
 * 消费者
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Goods> getAllOrders() {
        return restTemplate.getForObject("http://supplier-commodity//commodity/getAllCommodity",List.class);
    }
}
