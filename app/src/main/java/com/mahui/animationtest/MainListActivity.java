package com.mahui.animationtest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */

public class MainListActivity extends ListActivity {
    private List<String> mData = new ArrayList<String>(Arrays.asList("帧动画", "补间动画", "属性动画"));
    private ListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mData);
        getListView().setAdapter(mAdapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, FrameActivity.class);
                break;
            case 1:
                intent = new Intent(this, TweenActivity.class);
                break;
            case 2:
                intent = new Intent(this, PropertyActivity.class);
                break;
        }
        startActivity(intent);
    }
}
