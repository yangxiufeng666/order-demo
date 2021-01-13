package com.dsy.order.executor.query;

import com.dsy.order.query.OrderListQry;
import com.dsy.sunshine.core.ResponseWithData;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-12
 * @time 14:25
 */
@Component
public class OrderListQryExe {

    public ResponseWithData executor(OrderListQry qry){

        return ResponseWithData.buildSuccess();

    }

}
