package com.atguigu.gmall.pms;



import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        Product byId = productService.getById(1);
//        System.out.println(byId.getName());

        Brand brand = new Brand();
        brand.setName("liyuqi");
        brandService.save(brand);
        System.out.println("保存成功");
    }

}
