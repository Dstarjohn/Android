package com.stx.xhb.dmgameapp.data.entity;

import com.stx.xhb.dmgameapp.base.BaseEntity;

import java.util.List;

/*
 * @author lx
 */

public class NewsChannelListBean extends BaseEntity{

    private String channels_version;
    private List<HtmlEntity> html;

    public String getChannels_version() {
        return channels_version;
    }

    public List<HtmlEntity> getHtml() {
        return html;
    }

    public static class HtmlEntity {

        private String appid;
        private String title;
        private String type;

        public String getAppid() {
            return appid;
        }

        public String getTitle() {
            return title;
        }

        public String getType() {
            return type;
        }
    }
}
