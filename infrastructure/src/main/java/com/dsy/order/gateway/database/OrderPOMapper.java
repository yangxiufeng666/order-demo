package com.dsy.order.gateway.database;

import com.dsy.order.gateway.database.po.OrderPO;

public interface OrderPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderPO record);

    int insertSelective(OrderPO record);

    OrderPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderPO record);

    int updateByPrimaryKey(OrderPO record);
}