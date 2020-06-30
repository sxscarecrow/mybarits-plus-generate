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
public class HifiveMadeCost extends Model<HifiveMadeCost> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String artist;

    private String album;

    private String song;

    /**
     * 总共的制作成本，单位为分
     */
    private BigDecimal totalFee;

    /**
     * 还有多少制作成本待扣，单位为分
     */
    private BigDecimal leftCost;

    /**
     * 默认为“全平台”, 表示费用只在某个平台的结算费用中扣除，多个平台用逗号隔开
     */
    private String platforms;

    /**
     * 分账批次ID
     */
    private Integer royaltyLogId;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
