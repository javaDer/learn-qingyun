package com.wwjswly.learn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangzhaofa
 * @since 2018-12-15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String userName;

    private String userPhone;

    private String userEmail;

    private String userPwd;

    /**
     * MD5
     */
    private String pwdSalt;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;

    /**
     * 0-1-
     */
    private Integer isDelete;
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    @Override
    public String toString() {
        return "TUser{" +
        "id=" + id +
        ", userName=" + userName +
        ", userPhone=" + userPhone +
        ", userEmail=" + userEmail +
        ", userPwd=" + userPwd +
        ", pwdSalt=" + pwdSalt +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        ", isDelete=" + isDelete +
        "}";
    }
}
