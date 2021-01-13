package com.dsy.order.executor.command;


import com.dsy.order.command.OrderAddCmd;
import com.dsy.order.gateway.database.OrderItemPOMapper;
import com.dsy.order.gateway.database.OrderPOMapper;
import com.dsy.order.gateway.database.po.OrderItemPO;
import com.dsy.sunshine.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:58
 */
@Component
public class OrderAddCmdExe {

    @Autowired
    private OrderPOMapper orderPOMapper;

    @Autowired
    private OrderItemPOMapper orderItemPOMapper;

    public Response executor(OrderAddCmd cmd){
        return null;
    }

}
