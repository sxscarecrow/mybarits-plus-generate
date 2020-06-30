package com.shenxu.test.service.impl;

import com.shenxu.test.entity.Role;
import com.shenxu.test.repostory.RoleRepostory;
import com.shenxu.test.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统角色 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleRepostory, Role> implements RoleService {

}
