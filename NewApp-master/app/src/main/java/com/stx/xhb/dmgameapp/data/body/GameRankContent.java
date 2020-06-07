package com.stx.xhb.dmgameapp.data.body;

import com.stx.core.utils.StringUtils;

/*
 * @author lx
 */
public class GameRankContent {
    private int pagesize = 10;
    private int page = 1;
    private long time;
    private String sign = "";
    private String uid="";

    public GameRankContent(int page, String uid) {
        this.page = page;
        this.uid = uid;
        this.time = System.currentTimeMillis();
        this.sign = StringUtils.getMD5(uid+String.valueOf(pagesize) + page + time);
    }
}
