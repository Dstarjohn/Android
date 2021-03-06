package com.stx.xhb.dmgameapp.data.entity;

import java.util.List;

/*
 * @author lx
 * Describe：游戏列表
 */

public class GameListBean{


    private List<GameBean> newgame;
    private List<GameBean> expectgame;
    private List<GameBean> classicgame;
    private List<GameBean> hotgame;
    private List<NewsPageBean.SlidesBean> slides;

    public List<GameBean> getNewgame() {
        return newgame;
    }

    public List<GameBean> getExpectgame() {
        return expectgame;
    }

    public List<GameBean> getClassicgame() {
        return classicgame;
    }

    public List<GameBean> getHotgame() {
        return hotgame;
    }

    public List<NewsPageBean.SlidesBean> getSlides() {
        return slides;
    }
}
