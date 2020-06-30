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
public class ChangeRoyaltyAgg extends Model<ChangeRoyaltyAgg> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer aggRoyaltyId;

    /**
     * 修改后的上源op
     */
    private String opUid;

    private Integer royaltyLogId;

    /**
     * 分账月份
     */
    private LocalDateTime month;

    /**
     * HF的分成收入，单位为分
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

    /**
     * 平台
     */
    private String platform;

    /**
     * 各平台给hifive的分成，单位分，如果HF有音乐制作费用，会先扣除
     */
    private BigDecimal incomeHifiveGet;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
