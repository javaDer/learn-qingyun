package com.wwjswly.learn.api.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUserVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String userPhone;
    private String userEmail;
    private String userPwd;
    private String pwdSalt;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private Integer isDelete;
}
