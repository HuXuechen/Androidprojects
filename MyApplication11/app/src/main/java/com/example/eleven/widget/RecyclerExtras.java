package com.example.eleven.widget;

import android.view.View;

public class RecyclerExtras {
    // 定义一个循环视图列表项的点击监听器接口
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    // 定义一个循环视图列表项的长按监听器接口
    public interface OnItemLongClickListener {
        void onItemLongClick(View view, int position);
    }

}