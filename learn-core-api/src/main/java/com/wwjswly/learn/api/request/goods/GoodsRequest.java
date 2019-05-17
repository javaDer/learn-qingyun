package com.wwjswly.learn.api.request.goods;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * GoodsRequest
 *
 * @author ZhaoFa
 * @date 2019-05-17 14:49
 **/
@Data
@ApiModel(value = "GoodsRequest", description = "产品种类分页")
public class GoodsRequest {
    private Integer goodsId;
    @ApiModelProperty(value = "页面大小", example = "10")
    private Long size;
    /**
     * 页面大小
     */
    @ApiModelProperty(value = "当前页", example = "0")
    private Long current;
}
