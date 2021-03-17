package com.dsy.order.service;

import com.dsy.order.command.OrderAddCmd;
import com.dsy.order.executor.command.OrderAddCmdExe;
import com.dsy.order.executor.query.OrderListQryExe;
import com.dsy.order.query.OrderListQry;
import com.dsy.order.vo.OrderVO;
import com.dsy.sunshine.core.ResponseWithData;
import com.dsy.sunshine.web.log.annotation.SysLog;
import com.dsy.sunshine.web.log.enums.BusinessType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 9:39
 */
@Service
public class OrderAppService{

    @Autowired
    private OrderAddCmdExe orderAddCmdExe;
    @Autowired
    private OrderListQryExe orderListQryExe;

    @Transactional
    @SysLog(title = "新增", type = BusinessType.INSERT)
    public void addOrder(OrderAddCmd cmd) {
        orderAddCmdExe.executor(cmd);
    }

    @SysLog(title = "查询订单列表", type = BusinessType.QUERY)
    public ResponseWithData<List<OrderVO>> listOrder(OrderListQry qry) {
        return orderListQryExe.executor(qry);
    }
}
