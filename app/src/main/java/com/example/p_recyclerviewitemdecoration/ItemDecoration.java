package com.example.p_recyclerviewitemdecoration;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public  abstract class ItemDecoration {

    public  void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        onDraw(c,parent,state);
    }


    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        onDrawOver(c, parent,state);
    }

    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        getItemOffsets(outRect, ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(),
                parent);
    }

    @Deprecated
    public void getItemOffsets(Rect outRect, int itemPosition, RecyclerView parent) {
        outRect.set(0, 0, 0, 0);
    }
}