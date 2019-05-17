package com.wwjswly.learn.api.vo.goods;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * GoodsVo
 *
 * @author ZhaoFa
 * @date 2019-05-17 14:46
 **/
@Data
@ApiModel(value = "GoodsVo",description = "商品")
public class GoodsVo {
    private Integer goodsId;
    /**
     * 所属类别id
     */
    @ApiModelProperty(value = "所属类别id")
    private Integer categoryId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 别名
     */
    private String nickname;

    /**
     * 商品主图
     */
    private String image;

    /**
     * 删除 1是 2否
     */
    private Integer delState;

    /**
     * 简要描述
     */
    private String simpleDescribe;

    /**
     * 详细描述
     */
    private String detailDescribe;

    /**
     * 上架标志 1 已上架 0 未上架
     */
    private Integer isMarketable;

    /**
     * 推荐 1是 2否
     */
    private Integer recommend;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 创建者id
     */
    private Integer adminId;

}
