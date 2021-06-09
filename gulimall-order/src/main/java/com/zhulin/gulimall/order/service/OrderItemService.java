package com.zhulin.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhulin.common.utils.PageUtils;
import com.zhulin.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-04 16:44:33
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

