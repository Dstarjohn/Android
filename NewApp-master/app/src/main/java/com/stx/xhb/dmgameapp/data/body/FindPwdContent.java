package com.stx.xhb.dmgameapp.data.body;

import com.stx.core.utils.StringUtils;
import com.stx.xhb.dmgameapp.utils.AppUser;

/*
 * @author lx
 */
public class FindPwdContent {

    private String mobile;
    private String validate;
    private String passwd;
    private String checkpasswd;
    private long time;
    private String sign;

    public FindPwdContent(String mobile, String validate, String passwd) {
        this.mobile = mobile;
        this.validate = validate;
        this.passwd = passwd;
        this.checkpasswd = passwd;
        this.time = System.currentTimeMillis();
        this.sign = StringUtils.getMD5( mobile+validate + passwd + passwd + time);
    }
}
