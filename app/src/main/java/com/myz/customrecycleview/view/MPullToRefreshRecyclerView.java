package com.myz.customrecycleview.view;

import android.content.Context;
import android.util.AttributeSet;

import com.myz.mrecyclerview.pulltorefresh.LoadingLayout;
import com.myz.mrecyclerview.pulltorefresh.PullToRefreshRecyclerView;

/**
 * Created by Administrator on 2017/5/22.
 */

public class MPullToRefreshRecyclerView extends PullToRefreshRecyclerView {
    public MPullToRefreshRecyclerView(Context context) {
        super(context);
    }

    public MPullToRefreshRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MPullToRefreshRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    protected LoadingLayout createHeaderLoadingLayout(Context context, AttributeSet attrs) {
        return new MHeaderLoadingLayout(context);
    }

}
