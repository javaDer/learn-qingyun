package com.wwjswly.music.constant;

public class ConstantCloudMusic {

    public enum CLOUD_MUSIC {
        CLOUD_MUSIC_URL("https://api.imjad.cn/cloudmusic/"),
        NETEASE_CLOUD_MUSIC_URL("http://localhost:3000/");
        private String value;

        CLOUD_MUSIC(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum ClOUD_MUSIC_TYPE {
        TYPE_SONG("song", "单曲"),
        TYPE_LYRIC("lyric", "歌词"),
        TYPE_COMMENTS("comments", "评论"),
        TYPE_DETAIL("detail", "歌曲详情");
        private String type;
        private String desc;

        ClOUD_MUSIC_TYPE(String type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public String getType() {
            return type;
        }

        public String getDesc() {
            return desc;
        }
    }

}
