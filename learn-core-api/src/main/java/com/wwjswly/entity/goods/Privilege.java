package com.wwjswly.entity.goods;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 优惠信息
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@TableName("t_privilege")
public class Privilege extends Model<Privilege> {

    private static final long serialVersionUID = 1L;

    /**
     * 优惠id，主键，自增
     */
    @TableId(value = "privilege_id", type = IdType.AUTO)
    private Integer privilegeId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 享受批发价标志 1 享受批发价 0 不享受批发价
     */
    @TableField("is_wholeSalePrice")
    private Integer isWholesaleprice;

    /**
     * 是否享受折扣 1 是 0 否
     */
    @TableField("isDiscount")
    private Integer isDiscount;

    /**
     * 商品折扣 使用整数表示折扣数，比如98，表示98折
     */
    private Integer discount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 状态 1 已删除 2 未删除
     */
    private Integer state;

    /**
     * 管理员id
     */
    private Integer adminId;


    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsWholesaleprice() {
        return isWholesaleprice;
    }

    public void setIsWholesaleprice(Integer isWholesaleprice) {
        this.isWholesaleprice = isWholesaleprice;
    }

    public Integer getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Integer isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Override
    protected Serializable pkVal() {
        return this.privilegeId;
    }

    @Override
    public String toString() {
        return "Privilege{" +
        "privilegeId=" + privilegeId +
        ", userId=" + userId +
        ", isWholesaleprice=" + isWholesaleprice +
        ", isDiscount=" + isDiscount +
        ", discount=" + discount +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", state=" + state +
        ", adminId=" + adminId +
        "}";
    }
}
