package com.wwjswly.learn.api.base;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private int state;
    private T data;
    private boolean isSuccess;
    private String message;

}
