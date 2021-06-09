package com.zhulin.gulimall.member.dao;

import com.zhulin.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-03-04 16:54:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
