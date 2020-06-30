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
public class QqRoyalty extends Model<QqRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据唯一键，用于去重
     */
    private String uid;

    private String opUid;

    private String platform;

    private String artist;

    private String album;

    private String song;

    /**
     * 免费使用量
     */
    private Integer freeUsedNum;

    /**
     * 付费基本包月使用量
     */
    private Integer payBasedUsedNum;

    /**
     * 付费高级包月使用量
     */
    private Integer payAdvancedUsedNum;

    /**
     * 单曲订购量
     */
    private Integer singleSoldNum;

    /**
     * QQ给HF的免费使用的广告收入，受免费使用量影响，单位为分
     */
    private BigDecimal freeUsedIncomeHifiveGet;

    /**
     * QQ给HF的付费基本包月收入，只受付费基本包月使用量影响，单位为分
     */
    private BigDecimal payBasedUsedIncomeHifiveGet;

    /**
     * QQ给HF的付费高级包月使用收入，只受付费高级包月使用量影响，单位为分
     */
    private BigDecimal payAdvancedUsedIncomeHifiveGet;

    /**
     * QQ给HF的单曲订购收入，只受单曲订购量影响，单位为分
     */
    private BigDecimal singleSoldIncomeHifiveGet;

    /**
     * QQ给HF的乐币收入
     */
    private BigDecimal yueCoinIncomeHifiveGet;

    /**
     * QQ给HF的总收入，单位为分
     */
    private BigDecimal incomeHifiveGet;

    /**
     * HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCost;

    /**
     * 本期被扣除的HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCostOnce;

    /**
     * 待扣的HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCostLeft;

    /**
     * 预付款扣除
     */
    private BigDecimal prepaymentCostOnce;

    /**
     * HF运营成本，单位为分
     */
    private BigDecimal hifiveCost;

    /**
     * HF分成收入，单位为分
     */
    private BigDecimal hifiveIncome;

    /**
     * 艺人分成收入，单位为分
     */
    private BigDecimal artistIncome;

    /**
     * 录音权益份额
     */
    private BigDecimal masteryRatio;

    /**
     * 词曲权益份额
     */
    private BigDecimal publishingRatio;

    /**
     * 录音权益收入
     */
    private BigDecimal masteryIncome;

    /**
     * 词曲权益收入
     */
    private BigDecimal publishingIncome;

    /**
     * 0表示音乐,1表示mv
     */
    private Integer mvFlag;

    /**
     * 0表示北京腾讯，1表示深圳腾讯
     */
    private Integer source;

    private LocalDate month;

    /**
     * 分账批次
     */
    private Integer royaltyLogId;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
