package com.dsy.order.domain.model;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 10:19
 */
public class Order {

    /**
     * 订单号
     */
    private String orderSn;
    /**
     * 订单金额
     */
    private int totalPrice;

    private List<OrderItem> orderItems;



}
