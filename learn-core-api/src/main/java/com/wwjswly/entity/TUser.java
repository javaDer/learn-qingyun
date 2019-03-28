package com.wwjswly.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangzhaofa
 * @since 2018-12-15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private String messageId;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
