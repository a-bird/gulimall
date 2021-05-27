package com.zhulin.gulimall.member.feign.coupon;

import com.zhulin.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("gulimall-coupon")
public interface CouponHistoryFeign {

    @RequestMapping("/coupon/couponhistory/list")
    public R list(@RequestParam Map<String, Object> params);

}
