package com.stx.core.mvp;

/*
 * Describe：
 */
public interface IPresenter<V extends IView> {

    void attachView(V mvpView);

    void onStart();

    void detachView();

    boolean isViewBind();

}
