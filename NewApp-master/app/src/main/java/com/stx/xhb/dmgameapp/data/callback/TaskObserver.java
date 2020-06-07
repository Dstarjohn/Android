package com.stx.xhb.dmgameapp.data.callback;

/*
 * @author lx
 * @describe: TaskObserver 数据统一回调接口，方便快速切换数据获取框架，降低耦合度
 */
public interface TaskObserver<T> {

    void onTaskLoaded(T data);

    void onDataNotAvailable(String msg);

}
