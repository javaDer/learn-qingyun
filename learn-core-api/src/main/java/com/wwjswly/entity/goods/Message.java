package com.wwjswly.entity.goods;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@TableName("t_message")
public class Message extends Model<Message> {

    private static final long serialVersionUID = 1L;

    /**
     * 消息id，主键，自增1
     */
    @TableId(value = "message_id", type = IdType.AUTO)
    private Integer messageId;

    /**
     * 消息标题
     */
    private String messageTitle;

    /**
     * 简单描述
     */
    private String messageShortContext;

    /**
     * 消息内容
     */
    private String messageContext;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 推送时间
     */
    private LocalDateTime pushTime;

    /**
     * 推送标志，1 推送 2 未推送
     */
    private Integer push;

    /**
     * 立即推送标志，1 立即推送 2 否
     */
    private Integer pushNow;

    /**
     * 是否发送全部用户，1 是 2 否
     */
    private Integer isAll;

    /**
     * 用户id列表
     */
    private String userIds;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 删除状态 1 已删除 2 未删除
     */
    private Integer delState;

    /**
     * 创建者id
     */
    private Integer adminId;


    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageShortContext() {
        return messageShortContext;
    }

    public void setMessageShortContext(String messageShortContext) {
        this.messageShortContext = messageShortContext;
    }

    public String getMessageContext() {
        return messageContext;
    }

    public void setMessageContext(String messageContext) {
        this.messageContext = messageContext;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getPushTime() {
        return pushTime;
    }

    public void setPushTime(LocalDateTime pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getPush() {
        return push;
    }

    public void setPush(Integer push) {
        this.push = push;
    }

    public Integer getPushNow() {
        return pushNow;
    }

    public void setPushNow(Integer pushNow) {
        this.pushNow = pushNow;
    }

    public Integer getIsAll() {
        return isAll;
    }

    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    public String getUserIds() {
        return userIds;
    }

    public void setUserIds(String userIds) {
        this.userIds = userIds;
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

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Override
    protected Serializable pkVal() {
        return this.messageId;
    }

    @Override
    public String toString() {
        return "Message{" +
        "messageId=" + messageId +
        ", messageTitle=" + messageTitle +
        ", messageShortContext=" + messageShortContext +
        ", messageContext=" + messageContext +
        ", url=" + url +
        ", pushTime=" + pushTime +
        ", push=" + push +
        ", pushNow=" + pushNow +
        ", isAll=" + isAll +
        ", userIds=" + userIds +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", delState=" + delState +
        ", adminId=" + adminId +
        "}";
    }
}
