package com.stx.xhb.dmgameapp.mvp.contract;

import com.stx.core.mvp.IModel;
import com.stx.core.mvp.IView;
import com.stx.xhb.dmgameapp.data.entity.SaleGameBean;

/*
 * @author lx
 * @describe: 汉化
 */
public interface GetChinesizeListContract {

    interface Model extends IModel {
        void getChinesizeGame(int currentPage, int order);
    }

    interface View extends IView {
        void getNewGame(SaleGameBean saleGameBean);

        void getHotGame(SaleGameBean saleGameBean);

        void getFailed(String msg);

        void showLoading();

        void hideLoading();
    }


}
