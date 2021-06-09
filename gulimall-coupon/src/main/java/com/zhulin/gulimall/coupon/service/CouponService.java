package com.zhulin.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhulin.common.utils.PageUtils;
import com.zhulin.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-05 16:41:47
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

