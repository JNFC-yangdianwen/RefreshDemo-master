package edu.feicui.refreshdemo;

/**
 * Created by Administrator on 2016/6/4.
 */
public interface OnRefreshListener {
    /**
     * 下拉刷新
     */
    void onDownPullRefresh();

    /**
     * 上拉加载更多
     */
    void onLoadingMore();
}
