package com.stx.xhb.dmgameapp.mvp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.data.entity.NewsPageBean;
import com.stx.xhb.dmgameapp.mvp.ui.adapter.viewholder.VideoListViewHolder;

/*
 * @author lx
 * Describe：视频列表适配器
 */

public class VideoListAdapter extends RecyclerArrayAdapter<NewsPageBean.ListBean> {

    private LayoutInflater mLayoutInflater;

    public VideoListAdapter(Context context) {
        super(context);
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new VideoListViewHolder(mLayoutInflater.inflate(R.layout.list_item_video, parent, false));
    }
}
