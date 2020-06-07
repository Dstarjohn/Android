package com.stx.xhb.dmgameapp.data.entity;

/*
 * @author lx
 * @describe: 提交评论
 */
public class PostCommentRepsonse {

    /**
     * c_sid : 21451
     * id : 183365
     * position : 3
     * integralmsg :
     */

    private int c_sid;
    private int id;
    private int position;
    private String integralmsg;

    public int getC_sid() {
        return c_sid;
    }

    public void setC_sid(int c_sid) {
        this.c_sid = c_sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getIntegralmsg() {
        return integralmsg;
    }

    public void setIntegralmsg(String integralmsg) {
        this.integralmsg = integralmsg;
    }
}
