package com.shenxu.test.service.impl;

import com.shenxu.test.entity.ServerGrant;
import com.shenxu.test.repostory.ServerGrantRepostory;
import com.shenxu.test.service.ServerGrantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 开放服务授权 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class ServerGrantServiceImpl extends ServiceImpl<ServerGrantRepostory, ServerGrant> implements ServerGrantService {

}
