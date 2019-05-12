package com.wwjswly.learn.api.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel(value = "UserSaveRequest", description = "用户保存")
public class UserSaveRequest {
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
    private String messageId;

}
