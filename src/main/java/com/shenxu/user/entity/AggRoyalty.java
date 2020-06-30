package com.shenxu.user.entity;

import java.math.BigDecimal;
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
public class AggRoyalty extends Model<AggRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String opUid;

    private String artist;

    /**
     * 平台
     */
    private String platform;

    /**
     * 分成月份
     */
    private LocalDate month;

    /**
     * 各平台给hifive的分成，单位分，如果HF有音乐制作费用，会先扣除
     */
    private BigDecimal incomeHifiveGet;

    /**
     * 预付款扣除
     */
    private BigDecimal prepaymentCostOnce;

    /**
     * hifive的运营费用，单位为分
     */
    private BigDecimal hifiveCost;

    /**
     * hifive的分成收入，单位为分
     */
    private BigDecimal hifiveIncome;

    /**
     * 艺人的分成收入，单位为分
     */
    private BigDecimal artistIncome;

    /**
     * 录音权益收入
     */
    private BigDecimal masteryIncome;

    /**
     * 词曲权益收入
     */
    private BigDecimal publishingIncome;

    private BigDecimal rate;

    /**
     * 分账批次
     */
    private Integer royaltyLogId;

    /**
     * 0表示未到账，1表示到账,2表示分账完成并归档
     */
    private Integer status;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
