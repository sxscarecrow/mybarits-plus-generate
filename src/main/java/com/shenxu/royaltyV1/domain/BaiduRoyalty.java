package com.shenxu.royaltyV1.domain;

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
 * @since 2020-05-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BaiduRoyalty extends Model<BaiduRoyalty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 数据唯一键，用于去重
     */
    private String uid;

    private String opUid;

    private String hfc;

    private String jasrac;

    private String upc;

    private String jan;

    private String isrc;

    private String artist;

    private String album;

    private String song;

    private String baiduAlbumId;

    private String baiduSongId;

    /**
     * vip试听量
     */
    private Integer vipListenNum;

    /**
     * vip下载量
     */
    private Integer vipDownloadNum;

    /**
     * 百度给hifive的vip试听收入，单位为分
     */
    private BigDecimal vipListenIncomeHifiveGet;

    /**
     * 百度给hifive的vip下载收入，单位为分
     */
    private BigDecimal vipDownloadIncomeHifiveGet;

    /**
     * 流量试听量
     */
    private Integer flowListenNum;

    /**
     * 流量下载量
     */
    private Integer flowDownloadNum;

    /**
     * 百度给hifive的流量试听收入，单位为分
     */
    private BigDecimal flowListenIncomeHifiveGet;

    /**
     * 百度给hifive的流量下载收入，单位为分
     */
    private BigDecimal flowDownloadIncomeHifiveGet;

    /**
     * 百度给hifive的单曲总收入，单位为分
     */
    private BigDecimal incomeHifiveGet;

    /**
     * HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCost;

    /**
     * 本期被扣除的HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCostOnce;

    /**
     * 待扣的HF音乐制成成本，单位为分
     */
    private BigDecimal hifiveMadeCostLeft;

    /**
     * 预付款扣除
     */
    private BigDecimal prepaymentCostOnce;

    /**
     * hifive运营成本20%，单位为分
     */
    private BigDecimal hifiveCost;

    /**
     * hifive分成收入，单位为分
     */
    private BigDecimal hifiveIncome;

    /**
     * 艺人实际收入，按分成比例，单位为分
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

    private LocalDate month;

    /**
     * 0表示未确认，1表示确认完成
     */
    private Integer status;

    /**
     * 分账批次
     */
    private Integer royaltyLogId;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
