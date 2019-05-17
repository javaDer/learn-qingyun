package com.wwjswly.learn.api.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * UserInfoRequest
 *
 * @author ZhaoFa
 * @date 2019-05-09 11:44
 **/
@Data
@ApiModel(value = "UserInfoRequest", description = "保存用户")
public class UserInfoRequest {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "用户姓名", example = "张三")
    private String userName;
    @ApiModelProperty(value = "电话号码")
    private String userPhone;
    @ApiModelProperty(value = "用户Email")
    private String userEmail;
    @ApiModelProperty(value = "密码")
    private String userPwd;
}
