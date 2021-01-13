package com.dsy.order.gateway.adapter.repository;

import com.dsy.order.gateway.database.OrderInfoPOMapper;
import com.dsy.order.gateway.database.OrderItemPOMapper;
import com.dsy.order.gateway.database.po.OrderInfoPO;
import com.dsy.order.gateway.database.po.OrderItemPO;
import com.dsy.order.gateway.port.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 14:56
 */
@Component
public class OrderRepositoryImpl implements OrderRepository {
    @Autowired
    private OrderInfoPOMapper orderPOMapper;
    @Autowired
    private OrderItemPOMapper orderItemPOMapper;

    @Override
    public void addOrder(OrderInfoPO orderPO, List<OrderItemPO> itemPOList) {
        orderPOMapper.insert(orderPO);
        orderItemPOMapper.insertAll(itemPOList);
    }
}
