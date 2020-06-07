package com.stx.xhb.dmgameapp.data.entity;

import com.stx.xhb.dmgameapp.base.BaseEntity;

import java.util.List;

/*
 * @author lx
 */

public class GameNewsListBean extends BaseEntity{

    private String totalrow;
    private List<NewsListBean.ChannelEntity.HtmlEntity> html;

    public String getTotalrow() {
        return totalrow;
    }

    public List<NewsListBean.ChannelEntity.HtmlEntity> getHtml() {
        return html;
    }

}
