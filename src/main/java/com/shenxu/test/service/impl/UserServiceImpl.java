package com.shenxu.test.service.impl;

import com.shenxu.test.entity.User;
import com.shenxu.test.repostory.UserRepostory;
import com.shenxu.test.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserRepostory, User> implements UserService {

}
