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
public class Prepayment extends Model<Prepayment> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 预付款单据唯一编号
     */
    private String uid;

    /**
     * 上源OP
     */
    private String company;

    /**
     * 预付款金额，单位为分
     */
    private BigDecimal money;

    /**
     * 合同日期
     */
    private LocalDate contractDate;

    /**
     * 授权年限
     */
    private Integer years;

    /**
     * 扣除平台
     */
    private String platforms;

    /**
     * 是否买断, 1表示买断
     */
    private Integer beBuyout;

    /**
     * 版税拆分批次
     */
    private Integer royaltyLogId;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
