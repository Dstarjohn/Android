package com.stx.xhb.dmgameapp.mvp.presenter;

import android.text.TextUtils;

import com.stx.core.mvp.BasePresenter;
import com.stx.xhb.dmgameapp.data.callback.LoadTaskCallback;
import com.stx.xhb.dmgameapp.data.entity.NewsPageBean;
import com.stx.xhb.dmgameapp.data.remote.TasksRepositoryProxy;
import com.stx.xhb.dmgameapp.mvp.contract.GetVideoContract;

import rx.Subscription;

/*
 * @author lx
 */

public class GetVideoListPresenter extends BasePresenter<GetVideoContract.getVideoListView> implements GetVideoContract.getVideoModel {

    @Override
    public void getVideoList(int currentPage) {
        if (getView() == null) {
            return;
        }
        Subscription subscription = TasksRepositoryProxy.getInstance().getVideoPage(currentPage, new LoadTaskCallback<NewsPageBean>() {
            @Override
            public void onTaskLoaded(NewsPageBean data) {
                getView().getVideoListSuccess(data);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                getView().getVideoListFailed(TextUtils.isEmpty(msg) ? "服务器请求失败，请重试" : msg);
            }

            @Override
            public void onCompleted() {
                getView().hideLoading();
            }
        });
        addSubscription(subscription);
    }
}
