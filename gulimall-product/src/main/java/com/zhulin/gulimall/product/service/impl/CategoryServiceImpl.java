package com.zhulin.gulimall.product.service.impl;

import com.zhulin.common.utils.PageUtils;
import com.zhulin.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zhulin.gulimall.product.dao.CategoryDao;
import com.zhulin.gulimall.product.entity.CategoryEntity;
import com.zhulin.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getListTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectByMap(null);
        List<CategoryEntity> categoryEntityList = categoryEntities.stream().filter(categoryEntity -> (
                categoryEntity.getParentCid() == 0
        )).map((category) -> {
            category.setChildCategory(findChildCategory(category, categoryEntities));
            return category;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return categoryEntityList;
    }

    @Override
    public void deleteMenuByIds(List<Long> asList) {
        // TODO 删除菜单判断
        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 查找所有子菜单
     *
     * @param root
     * @param allCategory
     * @return
     */
    private List<CategoryEntity> findChildCategory(CategoryEntity root, List<CategoryEntity> allCategory) {
        List<CategoryEntity> categoryEntities = allCategory.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().longValue() == root.getCatId().longValue();
        }).map(category-> {
            category.setChildCategory(findChildCategory(category, allCategory));
            return category;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return categoryEntities;
    }

}