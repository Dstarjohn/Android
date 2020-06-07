package com.stx.xhb.dmgameapp.data.entity;

import com.stx.xhb.dmgameapp.base.BaseEntity;

import java.util.List;

/*
 * @author lx
 */

public class GameVideoBean extends BaseEntity{

    private int totalrow;
    private List<VideoListBean.VideoBean> html;

    public int getTotalrow() {
        return totalrow;
    }

    public List<VideoListBean.VideoBean> getHtml() {
        return html;
    }
}
