package com.wwjswly.learn.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "TuserRequest", description = "用户分页")
public class TuserRequest {
    /**
     * id
     */
    @ApiModelProperty("id")
    private long id;
    /**
     * 页面大小
     */
    @ApiModelProperty(value = "页面大小",example = "10")
    private Long size;
    /**
     * 页面大小
     */
    @ApiModelProperty(value = "当前页",example = "0")
    private Long current;
}
