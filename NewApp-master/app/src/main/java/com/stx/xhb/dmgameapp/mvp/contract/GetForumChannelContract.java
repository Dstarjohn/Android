package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.ForumChannelListBean;

import java.util.List;

/*
 * @author lx
 * Describe：
 */
public interface GetForumChannelContract {

    interface getChanelModel extends IModel {
        void getChannelList();
    }

    interface getChannelListView extends IView {

        void getChannelSuccess(List<ForumChannelListBean.HtmlEntity> channelList);

        void getChanelFailed(String msg);

        void showLoading();

        void hideLoading();
    }
}
