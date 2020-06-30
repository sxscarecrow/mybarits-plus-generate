package com.shenxu.user.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class DetailRoyalty extends Model<DetailRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 艺人名称
     */
    private String artist;

    private String album;

    /**
     * 歌曲名字
     */
    private String song;

    /**
     * 预付款的id
     */
    private String prepaymentUid;

    /**
     * 平台
     */
    private String platform;

    /**
     * 总的钱 单位分
     */
    private BigDecimal total;

    /**
     * 本次扣除的钱 单位分
     */
    private BigDecimal once;

    /**
     * 分账批次
     */
    private Integer royaltyLogId;

    /**
     * 1->制作成本 2->预付款
     */
    private Integer type;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
