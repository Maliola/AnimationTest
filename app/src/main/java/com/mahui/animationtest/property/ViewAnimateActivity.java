package com.mahui.animationtest.property;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.mahui.animationtest.R;

/**
 * Created by Administrator on 2016/12/12.
 */

public class ViewAnimateActivity extends Activity{
    private ImageView id_ball;
    private float mScreenHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_layout);
        id_ball= (ImageView) findViewById(R.id.id_ball);

        DisplayMetrics outMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(outMetrics);
        mScreenHeight = outMetrics.heightPixels;
    }
    public void viewAnim(View view){
        id_ball.animate().alpha(0).y(mScreenHeight/2).setDuration(1000).withStartAction(new Runnable() {
            @Override
            public void run() {
            }
        }).withEndAction(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        id_ball.setY(0);
                        id_ball.setAlpha(1.0f);
                    }
                });
            }
        }).start();
    }
    public void propertyValuesHolder(View view){
        PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat("alpha", 1f, 0f, 1f);
        PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat("scaleX", 1f, 0, 1f);
        PropertyValuesHolder pvhZ = PropertyValuesHolder.ofFloat("scaleY", 1f, 0, 1f);
        ObjectAnimator.ofPropertyValuesHolder(id_ball, pvhX, pvhY,pvhZ).setDuration(1000).start();
    }
}
