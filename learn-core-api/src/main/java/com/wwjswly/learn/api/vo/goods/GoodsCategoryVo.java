package com.wwjswly.learn.api.vo.goods;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GoodsCategoryVo {
    private Integer categoryId;

    /**
     * 父种类id 为零表示顶层种类
     */
    private Integer parentId;

    /**
     * 商品种类名称
     */
    private String categoryName;

    /**
     * 商品种类主图
     */
    private String image;

    /**
     * 状态 1.启用 2.未启用 3 已删除
     */
    private Integer state;

    /**
     * 简要描述
     */
    private String simpleDescribe;

    /**
     * 推荐标志 1是 2否
     */
    private Integer recommend;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建者id
     */
    private Integer adminId;
}
