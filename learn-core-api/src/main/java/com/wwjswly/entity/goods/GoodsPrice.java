package com.wwjswly.entity.goods;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 商品规格价格
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@TableName("t_goods_price")
public class GoodsPrice extends Model<GoodsPrice> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品规格价格id
     */
    @TableId(value = "price_id", type = IdType.AUTO)
    private Integer priceId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 计量单位
     */
    private String unitName;

    /**
     * 零售价（以分为单位）
     */
    private Integer retailPrice;

    /**
     * 采购价（以分为单位）
     */
    private Integer buyPrice;

    /**
     * 批发价（以分为单位）
     */
    private Integer wholesalePrice;

    /**
     * 状态：1.启用 2.未启用 （后台未启用页面不显示，前台显示已下架）
     */
    private Integer state;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建者id
     */
    private Integer adminId;


    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Integer getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(Integer wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Override
    protected Serializable pkVal() {
        return this.priceId;
    }

    @Override
    public String toString() {
        return "GoodsPrice{" +
        "priceId=" + priceId +
        ", goodsId=" + goodsId +
        ", unitName=" + unitName +
        ", retailPrice=" + retailPrice +
        ", buyPrice=" + buyPrice +
        ", wholesalePrice=" + wholesalePrice +
        ", state=" + state +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", adminId=" + adminId +
        "}";
    }
}
