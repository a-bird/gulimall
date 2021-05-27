package com.zhulin.gulimall.product;

import com.zhulin.gulimall.product.entity.BrandEntity;
import com.zhulin.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    Logger logger = LoggerFactory.getLogger("GulimallProductApplicationTests");

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("中电");
        brandService.save(brandEntity);
        System.out.println("添加品牌成功");
        logger.debug("添加品牌成功");
    }

}
