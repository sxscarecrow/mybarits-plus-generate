package com.shenxu.test.service.impl;

import com.shenxu.test.entity.Company;
import com.shenxu.test.repostory.CompanyRepostory;
import com.shenxu.test.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业用户 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyRepostory, Company> implements CompanyService {

}
