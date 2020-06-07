package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.ForumListBean;

import java.util.List;

/*
 * @author lx
 * Drscribe:
 */
public interface GetForumDetailsListContract {

    interface getForumListModel extends IModel {
        void getForumListData(String fid, int page);
    }

    interface getForumListDataView extends IView {

        void getForumListDataSuccess(List<ForumListBean.HtmlBean> data);

        void getForumListDataFailed(String msg);

        void showLoading();

        void hideLoading();
    }
}
