package com.zhulin.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhulin.common.utils.PageUtils;
import com.zhulin.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-04 16:54:36
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

