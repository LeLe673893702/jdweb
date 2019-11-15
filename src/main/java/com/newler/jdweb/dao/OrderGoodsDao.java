package com.newler.jdweb.dao;

import com.newler.jdweb.pojo.OrderGoods;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsDao {
    int addOrderGoods(OrderGoods orderGoods);

    int deleteByOrderId(long orderId);

    int deleteByGoodsId(long goodsId);

    int deleteOrderGoods(@Param("orderId") long orderId, @Param("goodsId") long goodsId);
}
