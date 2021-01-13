package com.dsy.order.gateway.adapter.client;

import com.dsy.order.gateway.port.client.InventoryClient;
import com.dsy.sunshine.core.Response;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-13
 * @time 15:13
 */
@Component
public class InventoryClientAdapter implements InventoryClient {
    @Override
    public Response check() {
        return Response.buildSuccess();
    }
}
