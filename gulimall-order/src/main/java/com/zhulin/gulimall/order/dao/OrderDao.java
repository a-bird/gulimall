package com.zhulin.gulimall.order.dao;

import com.zhulin.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-04 16:44:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
