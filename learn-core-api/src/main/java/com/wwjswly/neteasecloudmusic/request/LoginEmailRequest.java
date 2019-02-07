package com.wwjswly.neteasecloudmusic.request;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jack
 */
@Data
@ApiModel(description = "网易邮箱登录")
public class LoginEmailRequest {
    @ApiModelProperty("电子邮箱")
    private String email;
    @ApiModelProperty("密码")
    private String password;
}
