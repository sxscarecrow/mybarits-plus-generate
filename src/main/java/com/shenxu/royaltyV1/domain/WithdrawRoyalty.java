package com.shenxu.royaltyV1.domain;

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
 * @since 2020-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WithdrawRoyalty extends Model<WithdrawRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String opUid;

    /**
     * 用户实际提现金额
     */
    private Integer amount;

    /**
     * 交易账号 用户账号
     */
    private String tradeAccount;

    /**
     * 本地交易号 我们给微信
     */
    private String tradeId;

    /**
     * 微信交易号  微信给我们
     */
    private String transactId;

    /**
     * 结算的批次，对应多个royalty_log
     */
    private Integer batchId;

    private String remark;

    private LocalDateTime createdTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
