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
 * 企业应用
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_company_app")
public class CompanyApp extends Model<CompanyApp> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 企业id
     */
    private Long companyId;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 应用图标
     */
    private String icon;

    /**
     * ip白名单
     */
    private String ipTable;

    /**
     * 应用id
     */
    private String appId;

    /**
     * secret
     */
    private String secret;

    /**
     * 加密秘钥
     */
    private String codecSecret;

    /**
     * 应用地址/域名
     */
    private String siteUrl;

    /**
     * 应用包名
     */
    private String appPackage;

    /**
     * 应用平台
     */
    private String platform;

    /**
     * 状态：0-禁用；1-启用；
     */
    private Integer status;

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
