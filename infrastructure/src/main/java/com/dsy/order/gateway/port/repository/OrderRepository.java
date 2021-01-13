package com.dsy.order.gateway.port.repository;

import com.dsy.order.gateway.database.po.OrderInfoPO;
import com.dsy.order.gateway.database.po.OrderItemPO;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 14:47
 */
public interface OrderRepository {

    void addOrder(OrderInfoPO orderPO , List<OrderItemPO> itemPOList);

}
