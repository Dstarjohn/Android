package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.ForumBean;

import java.util.List;

/*
 * @author lx
 * Describe：
 */
public interface GetForumListContract {

    interface getForumListModel extends IModel {
        void getForumListData(String fid);
    }

    interface getForumListView extends IView {

        void getForumListDataSuccess(List<ForumBean> listData);

        void getForumListDataFailed(String msg);

        void showLoading();

        void hideLoading();
    }
}
