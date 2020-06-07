package com.stx.xhb.dmgameapp.mvp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.data.entity.SaleGameBean;
import com.stx.xhb.dmgameapp.mvp.ui.adapter.viewholder.GameCommonViewHolder;

import butterknife.Bind;

/*
 * @author lx
 */
public class GameCommonAdapter extends RecyclerArrayAdapter<SaleGameBean.ListBean> {

    private LayoutInflater mLayoutInflater;

    public GameCommonAdapter(Context context) {
        super(context);
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getViewType(int position) {
        return super.getViewType(position);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new GameCommonViewHolder(mLayoutInflater.inflate(R.layout.list_item_sale_game, parent, false));
    }
}
