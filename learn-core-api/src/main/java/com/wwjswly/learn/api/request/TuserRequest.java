package com.wwjswly.learn.api.request;

import lombok.Data;

@Data
public class TuserRequest {
    private long id;
    private Long total;
    private Long size;
    private Long current;
}
