package com.mahui.animationtest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.mahui.animationtest.property.AnimatorSetActivity;
import com.mahui.animationtest.property.LayoutAnimaActivity;
import com.mahui.animationtest.property.ObjectAnimActivity;
import com.mahui.animationtest.property.ValueAnimatorActivity;
import com.mahui.animationtest.property.ViewAnimateActivity;
import com.mahui.animationtest.property.Xml4AnimActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/12/12.
 */

public class PropertyActivity extends ListActivity {
    private List<String> mData = new ArrayList<String>(Arrays.asList(
            "xml属性动画", "ObjectAnimator动画", "AnimatorSet动画",
            "View的anim", "Layout Anim", "ValueAnimator动画"));
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
                intent = new Intent(this, Xml4AnimActivity.class);
                break;
            case 1:
                intent = new Intent(this, ObjectAnimActivity.class);
                break;
            case 2:
                intent = new Intent(this, AnimatorSetActivity.class);
                break;
            case 3:
                intent = new Intent(this, ViewAnimateActivity.class);
                break;
            case 4:
                intent = new Intent(this, LayoutAnimaActivity.class);
                break;
            case 5:
                intent = new Intent(this, ValueAnimatorActivity.class);
                break;
        }
        startActivity(intent);
    }
}
