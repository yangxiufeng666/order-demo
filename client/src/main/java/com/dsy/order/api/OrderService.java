package com.dsy.order.api;

import com.dsy.order.command.OrderAddCmd;
import com.dsy.order.query.OrderListQry;
import com.dsy.sunshine.core.Response;
import com.dsy.sunshine.core.ResponseWithData;


/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:35
 */
public interface OrderService {

    Response addOrder(OrderAddCmd cmd);

    ResponseWithData listOrder(OrderListQry qry);

}
