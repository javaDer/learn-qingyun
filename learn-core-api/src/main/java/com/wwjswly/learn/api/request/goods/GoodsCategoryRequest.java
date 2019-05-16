package com.wwjswly.learn.api.request.goods;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhaofa
 */
@Data
@ApiModel(value = "GoodsCategoryRequest", description = "产品种类分页")
public class GoodsCategoryRequest {
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
