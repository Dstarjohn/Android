package com.stx.xhb.dmgameapp.mvp.presenter;

import com.stx.core.mvp.BasePresenter;
import com.stx.xhb.dmgameapp.data.callback.LoadTaskCallback;
import com.stx.xhb.dmgameapp.data.entity.GameListBean;
import com.stx.xhb.dmgameapp.data.remote.TasksRepositoryProxy;
import com.stx.xhb.dmgameapp.mvp.contract.GetGameListContract;

/*
 * @author lx
 */

public class GetGameListPresenter extends BasePresenter<GetGameListContract.getGameListDataView> implements GetGameListContract.getGameListModel {
    @Override
    public void getGameListData() {
        if (getView() == null) {
            return;
        }
        TasksRepositoryProxy.getInstance().getHotGame(new LoadTaskCallback<GameListBean>() {
            @Override
            public void onStart() {
                getView().showLoading();
            }

            @Override
            public void onTaskLoaded(GameListBean data) {
                getView().getGameListDataSuccess(data);
            }

            @Override
            public void onDataNotAvailable(String msg) {
                getView().getGameListDataFailed(msg);
            }

            @Override
            public void onCompleted() {
                getView().hideLoading();
            }
        });
    }
}
