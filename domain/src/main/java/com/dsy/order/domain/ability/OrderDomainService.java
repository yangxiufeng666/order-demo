package com.dsy.order.domain.ability;

import com.dsy.order.domain.converter.OrderConverter;
import com.dsy.order.domain.exception.NotEnoughInventoryException;
import com.dsy.order.domain.model.Order;
import com.dsy.order.gateway.port.client.InventoryClient;
import com.dsy.order.gateway.port.repository.OrderRepository;
import com.dsy.sunshine.core.DomainService;
import com.dsy.sunshine.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 14:19
 */
@Component
public class OrderDomainService implements DomainService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private InventoryClient inventoryClient;

    public void addOrder(Order order){
        Response response = inventoryClient.check();
        if ( !response.isSuccess() ){
            throw new NotEnoughInventoryException("库存不足");
        }
        orderRepository.addOrder(OrderConverter.toDataObject(order) , OrderConverter.toItemDataObject(order));
    }

}
