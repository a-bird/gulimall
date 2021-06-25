package com.zhulin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhulin.common.utils.PageUtils;
import com.zhulin.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lql
 * @email zhulin4779@gmail.com
 * @date 2021-02-25 15:23:22
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> getListTree();

    void deleteMenuByIds(List<Long> asList);
}

