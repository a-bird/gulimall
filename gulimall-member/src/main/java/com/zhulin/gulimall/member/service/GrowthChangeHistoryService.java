package com.zhulin.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhulin.common.utils.PageUtils;
import com.zhulin.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-04 16:54:36
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

