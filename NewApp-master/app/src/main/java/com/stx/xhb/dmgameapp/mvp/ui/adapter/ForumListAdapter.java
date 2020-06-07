package com.stx.xhb.dmgameapp.mvp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.data.entity.ForumBean;
import com.stx.xhb.dmgameapp.mvp.ui.adapter.viewholder.ForumListViewHodler;

/*
 * @author lx
 */

public class ForumListAdapter extends RecyclerArrayAdapter<ForumBean> {

    private final LayoutInflater mLayoutInflater;

    public ForumListAdapter(Context context) {
        super(context);
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ForumListViewHodler(mLayoutInflater.inflate(R.layout.list_item_forum, parent, false));
    }
}
