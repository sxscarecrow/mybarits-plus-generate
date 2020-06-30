package com.shenxu.test.service.impl;

import com.shenxu.test.entity.Menu;
import com.shenxu.test.repostory.MenuRepostory;
import com.shenxu.test.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统菜单 服务实现类
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuRepostory, Menu> implements MenuService {

}
