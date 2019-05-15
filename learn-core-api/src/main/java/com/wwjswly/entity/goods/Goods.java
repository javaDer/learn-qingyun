package com.wwjswly.entity.goods;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@TableName("t_goods")
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private Integer goodsId;

    /**
     * 所属类别id
     */
    private Integer categoryId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 别名
     */
    private String nickname;

    /**
     * 商品主图
     */
    private String image;

    /**
     * 删除 1是 2否
     */
    private Integer delState;

    /**
     * 简要描述
     */
    private String simpleDescribe;

    /**
     * 详细描述
     */
    private String detailDescribe;

    /**
     * 上架标志 1 已上架 0 未上架
     */
    private Integer isMarketable;

    /**
     * 推荐 1是 2否
     */
    private Integer recommend;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 创建者id
     */
    private Integer adminId;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

    public String getSimpleDescribe() {
        return simpleDescribe;
    }

    public void setSimpleDescribe(String simpleDescribe) {
        this.simpleDescribe = simpleDescribe;
    }

    public String getDetailDescribe() {
        return detailDescribe;
    }

    public void setDetailDescribe(String detailDescribe) {
        this.detailDescribe = detailDescribe;
    }

    public Integer getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(Integer isMarketable) {
        this.isMarketable = isMarketable;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
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
        return this.goodsId;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "goodsId=" + goodsId +
        ", categoryId=" + categoryId +
        ", goodsName=" + goodsName +
        ", nickname=" + nickname +
        ", image=" + image +
        ", delState=" + delState +
        ", simpleDescribe=" + simpleDescribe +
        ", detailDescribe=" + detailDescribe +
        ", isMarketable=" + isMarketable +
        ", recommend=" + recommend +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", adminId=" + adminId +
        "}";
    }
}
