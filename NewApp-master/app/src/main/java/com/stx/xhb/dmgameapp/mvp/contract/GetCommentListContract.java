package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.CommentListBean;

/*
 * @author lx
 * @describe:
 */

public interface GetCommentListContract {

    interface Model extends IModel {
        void getCommentListData(int currentPage, String arcurl, int uid);

        void postComment(String arcurl,String comment, int uid);

        void replyComment(String uid, int id, String arcurl, String content);
    }

    interface View extends IView {

        void setCommentListData(CommentListBean commentListData);

        void getCommentListDataFailed();

        void postCommentSuccess();

        void postCommentFailed(String msg);

        void showLoading();

        void hideLoading();
    }
}
