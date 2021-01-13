package com.dsy.order.executor.command;


import com.dsy.order.command.OrderAddCmd;
import com.dsy.order.converter.OrderConverter;
import com.dsy.order.domain.ability.OrderDomainService;
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
    private OrderDomainService orderDomainService;

    public void executor(OrderAddCmd cmd){
         orderDomainService.addOrder(OrderConverter.toEntity(cmd));
    }

}
