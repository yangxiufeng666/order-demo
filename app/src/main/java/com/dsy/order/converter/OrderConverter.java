package com.dsy.order.converter;

import com.dsy.order.command.OrderAddCmd;
import com.dsy.order.model.Consignee;
import com.dsy.order.model.Order;
import com.dsy.order.model.OrderItem;
import com.dsy.order.util.BeanConvertUtils;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.UUID;


/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 15:30
 */
public class OrderConverter {

    public static Order toEntity(OrderAddCmd cmd){
        Consignee consignee = new Consignee();
        BeanUtils.copyProperties(cmd.getConsignee() , consignee);
        List<OrderItem> orderItems = BeanConvertUtils.convertListTo(cmd.getGoods(), OrderItem::new, (s, t) -> {});
        return new Order(UUID.randomUUID().toString(), orderItems , consignee);
    }

}
