package com.shenxu.test.service.impl;

import com.shenxu.test.entity.CompanyApp;
import com.shenxu.test.repostory.CompanyAppRepostory;
import com.shenxu.test.service.CompanyAppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业应用 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class CompanyAppServiceImpl extends ServiceImpl<CompanyAppRepostory, CompanyApp> implements CompanyAppService {

}
