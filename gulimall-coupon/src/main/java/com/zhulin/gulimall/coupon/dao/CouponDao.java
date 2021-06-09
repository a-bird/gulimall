package com.zhulin.gulimall.coupon.dao;

import com.zhulin.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-05 16:41:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
