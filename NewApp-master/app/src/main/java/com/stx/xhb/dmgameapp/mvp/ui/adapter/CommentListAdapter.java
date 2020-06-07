package com.stx.xhb.dmgameapp.mvp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.data.entity.CommentListBean;
import com.stx.xhb.dmgameapp.data.entity.CommentsBean;
import com.stx.xhb.dmgameapp.mvp.ui.adapter.viewholder.NewsCommentViewHolder;

/*
 * @author lx
 * @describe: 评论列表实体类
 */

public class CommentListAdapter extends RecyclerArrayAdapter<CommentListBean.ListBean> {

    private LayoutInflater mLayoutInflater;

    public CommentListAdapter(Context context) {
        super(context);
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsCommentViewHolder(mLayoutInflater.inflate(R.layout.list_item_comment, parent, false));
    }
}
