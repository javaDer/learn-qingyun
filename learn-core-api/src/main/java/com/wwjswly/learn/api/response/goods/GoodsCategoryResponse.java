package com.wwjswly.learn.api.response.goods;

import com.wwjswly.learn.api.vo.goods.GoodsCategoryVo;
import lombok.Data;

import java.util.List;

/**
 * @author zhaofa
 */
@Data
public class GoodsCategoryResponse {
    private List<GoodsCategoryVo> list;
    private Long total;
    private Long size;
    private Long current;

}
