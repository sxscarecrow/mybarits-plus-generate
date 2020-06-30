package com.shenxu.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * 企业用户
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_company")
public class Company extends Model<Company> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 企业图标
     */
    private String icon;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String pass;

    /**
     * 手机区号
     */
    private String phoneAreaCode;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 状态：0-禁用；1-启用；2-拒绝; 3-待审核
     */
    private Integer status;

    /**
     * 是否删除
     */
    private Integer isDelete;

    /**
     * 是否接入：0-未；1-接入
     */
    private Integer isJoin;

    /**
     * 备注
     */
    private String remark;

    /**
     * 审核原因
     */
    private String reason;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
