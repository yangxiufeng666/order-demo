package com.dsy.order;

import com.dsy.order.gateway.database.po.OrderInfoPO;
import com.dsy.order.util.BeanConvertUtils;
import com.dsy.order.vo.OrderVO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Mr.Yangxiufeng
 * @date 2021-01-11
 * @time 20:19
 */

@SpringBootTest
public class ApplicationTests {

    @Test
    public void Test1(){
        OrderInfoPO orderPO = new OrderInfoPO();
        orderPO.setId(1);
        orderPO.setOrderSn("202101121716001");

        OrderVO orderVO = BeanConvertUtils.convertTo(orderPO, OrderVO::new, (s , t) -> t.setOrderId(s.getId()));
        System.out.println(".....");
    }

}
