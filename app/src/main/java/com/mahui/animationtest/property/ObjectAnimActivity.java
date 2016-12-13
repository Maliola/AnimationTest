package com.mahui.animationtest.property;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.mahui.animationtest.R;

/**
 * Created by Administrator on 2016/12/12.
 */

public class ObjectAnimActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_main);
    }
    public void change(final View view){
        ObjectAnimator animator=ObjectAnimator.ofFloat(view,"mh",1.0F,0.2F).setDuration(1000);
        animator.start();
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float cVal= (float) animation.getAnimatedValue();
                view.setAlpha(cVal);
                view.setScaleX(cVal);
                view.setScaleY(cVal);
            }
        });
    }
}
