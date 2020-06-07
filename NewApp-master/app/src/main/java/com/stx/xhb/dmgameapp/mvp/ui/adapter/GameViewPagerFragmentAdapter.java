package com.stx.xhb.dmgameapp.mvp.ui.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.stx.core.base.BaseMvpFragment;

import java.util.List;

/**
 /*
 * @author lx
 * @describe: 游戏ViewPager适配器
 */
public class GameViewPagerFragmentAdapter extends FragmentStatePagerAdapter {
    private List<BaseMvpFragment> mFragmentList;
    private String[] TITLE={"热门","发售","汉化","排行","分类"};

    public GameViewPagerFragmentAdapter(FragmentManager fm, List<BaseMvpFragment> fragmentList) {
        super(fm);
        this.mFragmentList = fragmentList;
    }

    @Override
    public BaseMvpFragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position % TITLE.length];
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
