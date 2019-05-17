package com.wwjswly.learn.api.response.goods;

import com.wwjswly.learn.api.vo.goods.GoodsVo;
import lombok.Data;

import java.util.List;

/**
 * GoodsResponse
 *
 * @author ZhaoFa
 * @date 2019-05-17 15:05
 **/
@Data
public class GoodsResponse {
    private List<GoodsVo> list;
    private Long total;
    private Long size;
    private Long current;
}
