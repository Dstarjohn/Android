package com.stx.xhb.dmgameapp.share;

/*
 * @author lx
 * Description:分享渠道
 */
public class ShareChannel {

    private int icon;
    private String name;

    public ShareChannel(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

}
