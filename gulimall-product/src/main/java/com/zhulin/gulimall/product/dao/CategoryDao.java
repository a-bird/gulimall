package com.zhulin.gulimall.product.dao;

import com.zhulin.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-02-25 15:23:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
