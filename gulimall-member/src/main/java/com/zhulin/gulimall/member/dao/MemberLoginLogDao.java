package com.zhulin.gulimall.member.dao;

import com.zhulin.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-04 16:54:36
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
