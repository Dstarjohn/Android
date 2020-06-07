package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.GameListBean;
import com.stx.xhb.dmgameapp.data.entity.HotGameBean;

import java.util.List;

/*
 * @author lx
 * Describe：
 */
public interface GetGameListContract {

    interface getGameListModel extends IModel {
        void getGameListData();
    }


    interface getGameListDataView extends IView {

        void getGameListDataSuccess(GameListBean dataBean);

        void getGameListDataFailed(String msg);

        void showLoading();

        void hideLoading();

    }
}
