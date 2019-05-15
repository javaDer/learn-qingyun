package com.wwjswly.entity.goods;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 短信验证码
 * </p>
 *
 * @author zhangzhaofa
 * @since 2019-05-15
 */
@TableName("t_short_message")
public class ShortMessage extends Model<ShortMessage> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "message_id", type = IdType.AUTO)
    private Integer messageId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 验证码
     */
    private Integer code;

    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 短信验证码是否可用  1 可用 2 不可用
     */
    private Integer state;


    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return this.messageId;
    }

    @Override
    public String toString() {
        return "ShortMessage{" +
        "messageId=" + messageId +
        ", phone=" + phone +
        ", code=" + code +
        ", updateTime=" + updateTime +
        ", createTime=" + createTime +
        ", state=" + state +
        "}";
    }
}
