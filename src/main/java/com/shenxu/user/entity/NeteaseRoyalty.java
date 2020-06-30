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
public class NeteaseRoyalty extends Model<NeteaseRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据唯一键，用于去重
     */
    private String uid;

    private String opUid;

    private String neteaseSongId;

    private String artist;

    private String album;

    private String song;

    /**
     * 免费试听数
     */
    private Integer freeListenNum;

    /**
     * 免费下载数
     */
    private Integer freeDownloadNum;

    /**
     * 网易分给HF的单曲收入，单位为分
     */
    private BigDecimal singleIncomeHifiveGet;

    /**
     * 套餐试听量
     */
    private Integer packageListenNum;

    /**
     * 套餐下载量
     */
    private Integer packageDownloadNum;

    /**
     * 网易分给HF的套餐收入，单位为分
     */
    private BigDecimal packageIncomeHifiveGet;

    /**
     * 网易分给HF的总收入，单位为分
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
     * 单曲销售额，单位为分
     */
    private BigDecimal singleGmv;

    /**
     * 预付款扣除
     */
    private BigDecimal prepaymentCostOnce;

    /**
     * HF的运营成本，单位为分
     */
    private BigDecimal hifiveCost;

    /**
     * HF的分成收入，单位为分
     */
    private BigDecimal hifiveIncome;

    /**
     * 艺人的分成收入，单位为分
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
     * 0表示HF发网易，1表示无二发网易，2表示HF发广州网易的
     */
    private Integer source;

    private LocalDate month;

    /**
     * 分账批次
     */
    private Integer royaltyLogId;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

    /**
     * 待扣的HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCostLeft;

    /**
     * 单曲销售数量
     */
    private Integer singleSaleNum;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
