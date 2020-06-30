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
public class KgeRoyalty extends Model<KgeRoyalty> {

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
     * 词使用量
     */
    private Integer wordUsedNum;

    /**
     * 曲使用量
     */
    private Integer musicUsedNum;

    /**
     * 邻接权使用量-原版音源
     */
    private Integer djkUsedNumOfOri;

    /**
     * 邻接权使用量-版权方提供伴奏
     */
    private Integer djkUsedNumOfAcc;

    /**
     * 邻接权使用量-依据版权方提供音源制作伴奏
     */
    private Integer djkUsedNumOfSelfAcc;

    /**
     * 分成-词
     */
    private BigDecimal wordUsedIncome;

    /**
     * 分成-曲
     */
    private BigDecimal musicUsedIncome;

    /**
     * 分成-邻分成-邻接权-原版音源
     */
    private BigDecimal djkUsedOfOriIncome;

    /**
     * 分成-邻接权-版权方提供伴奏
     */
    private BigDecimal djkUsedOfAccIncome;

    /**
     * 分成-邻接权-依据版权方提供音源制作伴奏
     */
    private BigDecimal djkUsedOfSelfAccIncome;

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
