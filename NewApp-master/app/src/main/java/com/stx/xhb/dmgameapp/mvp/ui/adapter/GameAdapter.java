package com.stx.xhb.dmgameapp.mvp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.data.entity.GameBean;
import com.stx.xhb.dmgameapp.mvp.ui.adapter.viewholder.GameViewHolder;

/*
 * @author lx
 * @Describe： 游戏适配器
 */

public class GameAdapter extends RecyclerArrayAdapter<GameBean> {

    private LayoutInflater mLayoutInflater;

    public GameAdapter(Context context) {
        super(context);
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new GameViewHolder(mLayoutInflater.inflate(R.layout.list_item_game, null));
    }
}
