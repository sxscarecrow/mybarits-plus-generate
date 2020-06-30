package com.hifive.player.broadcasts.service.impl;

import com.hifive.player.broadcasts.entity.Weather;
import com.hifive.player.broadcasts.repostory.WeatherRepostory;
import com.hifive.player.broadcasts.service.WeatherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yzh
 * @since 2019-11-16
 */
@Service
public class WeatherServiceImpl extends ServiceImpl<WeatherRepostory, Weather> implements WeatherService {

}
