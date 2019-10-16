package com.wwjswly.webflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaofa
 * @title: ProxyIpEntity
 * @date 2019-10-16 10:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProxyIpEntity implements Serializable {
    private static final long serialVersionUID = -2081742442561524068L;
    private Long id;
    private String proxy;
    private String fail_count;
    private String region;
    private String type;
    private String check_count;
    private String last_status;
    private Date last_time;

}
