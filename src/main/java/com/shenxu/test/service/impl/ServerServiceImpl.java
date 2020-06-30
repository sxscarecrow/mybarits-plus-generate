package com.shenxu.test.service.impl;

import com.shenxu.test.entity.Server;
import com.shenxu.test.repostory.ServerRepostory;
import com.shenxu.test.service.ServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 开放服务 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class ServerServiceImpl extends ServiceImpl<ServerRepostory, Server> implements ServerService {

}
