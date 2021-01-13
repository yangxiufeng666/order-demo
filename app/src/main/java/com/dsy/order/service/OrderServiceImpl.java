package com.dsy.order.service;

import com.dsy.order.api.OrderService;
import com.dsy.order.command.OrderAddCmd;
import com.dsy.order.executor.command.OrderAddCmdExe;
import com.dsy.order.executor.query.OrderListQryExe;
import com.dsy.order.query.OrderListQry;
import com.dsy.sunshine.core.Response;
import com.dsy.sunshine.core.ResponseWithData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:39
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderAddCmdExe orderAddCmdExe;
    @Autowired
    private OrderListQryExe orderListQryExe;

    @Override
    public Response addOrder(OrderAddCmd cmd) {
        return orderAddCmdExe.executor(cmd);
    }

    @Override
    public ResponseWithData listOrder(OrderListQry qry) {
        return orderListQryExe.executor(qry);
    }
}
