package com.wwjswly.music.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author jack
 */
@Data
@ApiModel(value = "CloudMusicRequest", description = "网易云音乐参数")
public class CloudMusicRequest {
    private String type;
    private Integer id;

}
