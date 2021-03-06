package com.dsy.order.converter;

import com.dsy.order.model.Order;
import com.dsy.order.gateway.database.po.OrderInfoPO;
import com.dsy.order.gateway.database.po.OrderItemPO;
import com.dsy.order.util.BeanConvertUtils;

import java.util.Date;
import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 16:15
 */
public class OrderConverter {

    public static OrderInfoPO toDataObject(Order order){
        OrderInfoPO orderPO = new OrderInfoPO();
        orderPO.setCreateTime(new Date());
        orderPO.setOrderSn(order.getOrderSn());
        orderPO.setTotalPrice(order.getTotalPrice());
        return orderPO;
    }
    public static List<OrderItemPO> toItemDataObject(Order order){
        return BeanConvertUtils.convertListTo(order.getOrderItems(), OrderItemPO::new, null);
    }

}
