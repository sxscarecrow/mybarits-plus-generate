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
 * 开放服务授权
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_server_grant")
public class ServerGrant extends Model<ServerGrant> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 企业id
     */
    private Long companyId;

    /**
     * 应用id
     */
    private Long companyAppId;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 动作/服务
     */
    private String action;

    /**
     * 授权范围：服务器-SERVER_GRANT_SERVER;WEB应用-SERVER_GRANT_WEB;ANDORID应用-SERVER_GRANT_ANDORID;IOS应用-SERVER_GRANT_IOS;
     */
    private String scope;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
