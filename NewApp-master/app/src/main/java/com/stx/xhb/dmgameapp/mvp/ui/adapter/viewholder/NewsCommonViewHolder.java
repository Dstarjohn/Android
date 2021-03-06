package com.stx.xhb.dmgameapp.mvp.ui.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.stx.core.utils.DateUtils;
import com.stx.xhb.dmgameapp.R;
import com.stx.xhb.dmgameapp.data.entity.NewsPageBean;
import com.stx.xhb.dmgameapp.mvp.ui.activity.NewsDetailsActivity;
import com.stx.xhb.dmgameapp.mvp.ui.activity.WebDetailsActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/*
 * @author lx
 */

public class NewsCommonViewHolder extends BaseViewHolder<NewsPageBean.ListBean> {
    @Bind(R.id.title)
    TextView mTitle;
    @Bind(R.id.date)
    TextView mDate;
    @Bind(R.id.iv)
    ImageView mIv;
    @Bind(R.id.author)
    TextView tvAuthor;

    public NewsCommonViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(final NewsPageBean.ListBean data) {
        mTitle.setText(data.getTitle());
        tvAuthor.setText(data.getUser().getNickname());
        mDate.setText(DateUtils.getFriendlyTime(data.getPubdate_at()+"000"));
        Glide.with(getContext()).load(data.getLitpic()).into(mIv);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsDetailsActivity.start(getContext(),data.getWebviewurl(),data.getArcurl(),data.getTitle(),data.getLitpic());
            }
        });
    }
}
