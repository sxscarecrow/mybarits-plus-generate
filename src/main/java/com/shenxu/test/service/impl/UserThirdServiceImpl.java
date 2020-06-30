package com.shenxu.test.service.impl;

import com.shenxu.test.entity.UserThird;
import com.shenxu.test.repostory.UserThirdRepostory;
import com.shenxu.test.service.UserThirdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户三方账号 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class UserThirdServiceImpl extends ServiceImpl<UserThirdRepostory, UserThird> implements UserThirdService {

}
