package com.shenxu.test.service.impl;

import com.shenxu.test.entity.Product;
import com.shenxu.test.repostory.ProductRepostory;
import com.shenxu.test.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统产品表 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductRepostory, Product> implements ProductService {

}
