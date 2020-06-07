package com.stx.xhb.dmgameapp.mvp.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.stx.core.utils.AppUtils;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.base.BaseAppActitity;
import com.stx.xhb.dmgameapp.share.ShareDialog;
import com.umeng.analytics.MobclickAgent;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 关于界面
 */
public class  AboutActivity extends BaseAppActitity {

    @Bind(R.id.toolbar)
    Toolbar aboutToolbar;
    @Bind(R.id.version)
    TextView version;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_about;
    }

    @Override
    protected void onInitialization(Bundle bundle) {
        initView();
    }

    //初始化控件
    private void initView() {
        version.setText(AppUtils.getVersion(this));
        initToolBar(aboutToolbar, "关于");
    }


    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    @OnClick(R.id.article_share)
    public void onClick() {
        ShareDialog.share(getSupportFragmentManager(),"快来使用游戏资讯app，掌握最新游戏资讯,看美图！推荐你也来使用!", "https://www.coolapk.com/apk/com.stx.xhb.dmgameapp", "快来使用游戏资讯app，掌握最新游戏资讯,看美图！推荐你也来使用","");
    }
}
