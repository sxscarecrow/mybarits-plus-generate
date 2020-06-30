package com.shenxu.test.service.impl;

import com.shenxu.test.entity.UserRole;
import com.shenxu.test.repostory.UserRoleRepostory;
import com.shenxu.test.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户角色 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleRepostory, UserRole> implements UserRoleService {

}
