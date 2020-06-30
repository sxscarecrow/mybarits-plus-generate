package com.shenxu.royaltyV1.domain;

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
 * @since 2020-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChangeRoyaltyDetail extends Model<ChangeRoyaltyDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 唯一标识
     */
    private String uid;

    /**
     * 修改后的上源op
     */
    private String opUid;

    /**
     * 艺人
     */
    private String artist;

    /**
     * 专辑
     */
    private String album;

    /**
     * 歌曲名称
     */
    private String song;

    /**
     * 歌曲的唯一标识
     */
    private String hfc;

    /**
     * 所属平台
     */
    private String platform;

    private Integer royaltyLogId;

    /**
     * 分账月份
     */
    private LocalDateTime month;

    /**
     * HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCost;

    /**
     * 本期被扣除的HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCostOnce;

    /**
     * 预付款扣除
     */
    private BigDecimal prepaymentCostOnce;

    /**
     * 待扣的HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCostLeft;

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

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
