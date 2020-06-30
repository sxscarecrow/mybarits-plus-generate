package com.hifive.player.broadcasts.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yzh
 * @since 2019-11-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_weather")
public class Weather extends Model<Weather> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 天气id
     */
    private Long weatherId;

    /**
     * 天气名称
     */
    private String name;

    /**
     * 天气标题
     */
    private String title;

    /**
     * 天气描述
     */
    private String desc;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
