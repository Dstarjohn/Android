package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.NewsPageBean;
import com.stx.xhb.dmgameapp.data.entity.VideoListBean;

/*
 * @author lx
 */
public interface GetVideoContract {

    interface getVideoModel extends IModel {
        void getVideoList(int page);
    }

    interface getVideoListView extends IView {

        void getVideoListSuccess(NewsPageBean videoListBean);

        void getVideoListFailed(String msg);

        void showLoading();

        void hideLoading();
    }
}
