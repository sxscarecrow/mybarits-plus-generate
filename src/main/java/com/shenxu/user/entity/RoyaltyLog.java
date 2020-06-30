package com.shenxu.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author shenxu
 * @since 2020-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RoyaltyLog extends Model<RoyaltyLog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 平台
     */
    private String platform;

    /**
     * 起始月份
     */
    private LocalDate startMonth;

    /**
     * 结束月份
     */
    private LocalDate endMonth;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

    /**
     * 0 表示创建；1表示入库完成；2表示分账完成并归档
     */
    private Integer status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
