package com.dsy.order.gateway.database;

import com.dsy.order.gateway.database.po.OrderItemPO;

public interface OrderItemPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItemPO record);

    int insertSelective(OrderItemPO record);

    OrderItemPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItemPO record);

    int updateByPrimaryKey(OrderItemPO record);
}