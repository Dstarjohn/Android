package com.stx.xhb.dmgameapp.data.body;

import com.stx.core.utils.StringUtils;

/*
 * @author lx
 */
public class GameContent {
    private long time;
    private String sign = "";

    public GameContent() {
        this.time = System.currentTimeMillis();
        this.sign = StringUtils.getMD5(String.valueOf(time));
    }
}
