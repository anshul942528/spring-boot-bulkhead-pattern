package com.ansh.service;

import com.ansh.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BasicService {

    @Autowired
    private UserOrderService userOrderService;

    @Autowired
    private OrderDetailService orderDetailService;

    public OrderInfo getOrderDetails(int orderId, String status) {
        Order order = new Order();
        order.setOrderId(orderId);
        order.setStatus(status);
        return orderDetailService.getOrderDetail(order);
    }

    public UserOrders getUserOrders(int userId) {
        return userOrderService.getUserOrders(userId);
    }
}
