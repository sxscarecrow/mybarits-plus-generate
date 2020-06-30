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
 * 系统菜单
 * </p>
 *
 * @author shenxu
 * @since 2019-12-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父级
     */
    private Long parentId;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 公司id
     */
    private Long companyId;

    /**
     * 菜单名
     */
    private String name;

    /**
     * 组件名称
     */
    private String componentName;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 跳转连接
     */
    private String link;

    /**
     * 类型:1-目录；2-菜单；3-按钮；4-属性
     */
    private Integer type;

    /**
     * 权限
     */
    private String permis;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 描述
     */
    private String descri;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
