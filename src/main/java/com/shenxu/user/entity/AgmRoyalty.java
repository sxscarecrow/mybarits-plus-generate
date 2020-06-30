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
public class AgmRoyalty extends Model<AgmRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String opUid;

    /**
     * 订单号
     */
    private String orderId;

    private String platform;

    /**
     * 购买时间
     */
    private String buyTime;

    /**
     * 生效时间
     */
    private String startTime;

    /**
     * 过期时间
     */
    private String endTime;

    /**
     * 用户
     */
    private String consumer;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String postbox;

    /**
     * 企业
     */
    private String enterprise;

    /**
     * 公司
     */
    private String company;

    /**
     * 公司类型
     */
    private String companyType;

    /**
     * 歌曲ID
     */
    private Integer songId;

    /**
     * 授权歌曲
     */
    private String songName;

    /**
     * 曲库
     */
    private String warehouse;

    /**
     * 厂商
     */
    private String manufacturer;

    /**
     * 厂牌
     */
    private String brand;

    /**
     * 曲作者
     */
    private String composer;

    /**
     * 词作者
     */
    private String author;

    /**
     * 演唱者
     */
    private String artist;

    /**
     * 制作人
     */
    private String 

producer;

    /**
     * 支付金额
     */
    private BigDecimal paymentAmount;

    /**
     * 平台管理
     */
    private BigDecimal patformManagementCost;

    /**
     * HF收益
     */
    private BigDecimal hifiveIncome;

    /**
     * 版权方收益（小智）
     */
    private BigDecimal copyrightIncome;

    /**
     * 上源op
     */
    private String upOp;

    /**
     * 小智运营成本
     */
    private BigDecimal xiaozhiOperateRate;

    /**
     * 小智分账比例
     */
    private BigDecimal xiaozhiShareRate;

    /**
     * 合作伙伴分账比例
     */
    private BigDecimal partnerShareRate;

    /**
     * 小智代理分成
     */
    private BigDecimal xiaozhiIncome;

    /**
     * 合作伙伴实际收入
     */
    private BigDecimal partnerIncome;

    /**
     * 小智ID
     */
    private String xiaozhiId;

    /**
     * 支付方式
     */
    private String payMode;

    /**
     * 是否是企业支付
     */
    private String enterprisePay;

    /**
     * 结算方式
     */
    private String settlementMode;

    /**
     * 支付状态
     */
    private String status;

    /**
     * 授权主体
     */
    private String authorizeFrom;

    /**
     * 项目名
     */
    private String projectName;

    /**
     * 项目品牌
     */
    private String projectBrand;

    /**
     * 项目时长
     */
    private String projectTime;

    /**
     * 音乐用途
     */
    private String songPurpose;

    /**
     * 授权区域
     */
    private String authorizeArea;

    /**
     * 授权期限
     */
    private String authorizeTime;

    /**
     * 授权媒体
     */
    private String authorizeMedia;

    /**
     * 备注
     */
    private String remark;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private LocalDateTime deletedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
