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
public class BelieveRoyalty extends Model<BelieveRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据唯一键，用于去重
     */
    private String uid;

    private String opUid;

    private String artist;

    private String album;

    private String song;

    /**
     * 国家
     */
    private String country;

    /**
     * 海外发行平台
     */
    private String overseaPlatform;

    /**
     * 发行类型
     */
    private String publishType;

    /**
     * 销售类型
     */
    private String saleType;

    private String upc;

    private String isrc;

    /**
     * 销售数量
     */
    private Integer saleNum;

    /**
     * 客户付款货币，正常情况下是欧元
     */
    private String moneyType;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 机械费
     */
    private BigDecimal believeCost;

    /**
     * 总收入
     */
    private BigDecimal totalIncome;

    /**
     * 分成比例
     */
    private Double believeDividedRatio;

    /**
     * believe给hifive的收入
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
     * hifive运营费 20%
     */
    private BigDecimal hifiveCost;

    /**
     * hifive分成收入
     */
    private BigDecimal hifiveIncome;

    /**
     * 艺人分成收入
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
     * 报告月
     */
    private LocalDate month;

    /**
     * 销售月
     */
    private LocalDate saleDt;

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
