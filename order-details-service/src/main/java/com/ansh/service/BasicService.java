package com.ansh.service;

import com.ansh.model.OrderDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class BasicService {

    public OrderDetail getOrderInfo(int orderId) {
        int i = 0;
        while (true){
            i++;
            if(i == 1000)
                break;
        }
        OrderDetail orderDetail = new OrderDetail(15, 495224, "White Board");
        return orderDetail;
    }
}
