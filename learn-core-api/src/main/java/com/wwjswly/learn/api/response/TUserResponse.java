package com.wwjswly.learn.api.response;

import lombok.Data;
import com.wwjswly.learn.api.vo.TUserVo;

import java.util.List;

@Data
public class TUserResponse {
    private List<TUserVo> list;
    private Long total;
    private Long size;
    private Long current;
}
