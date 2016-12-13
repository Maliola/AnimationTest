package com.mahui.animationtest.property;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.mahui.animationtest.R;

/**
 * Created by Administrator on 2016/12/12.
 */

public class AnimatorSetActivity extends Activity{
    private ImageView ball;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animator_set);
        ball= (ImageView) findViewById(R.id.ball);
    }
    public void easyrun(View view){
        ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(ball,"scaleX",1.0f,2f);
        ObjectAnimator objectAnimator2=ObjectAnimator.ofFloat(ball,"scaleY",1.0f,2f);
        AnimatorSet animatorSet=new AnimatorSet();
        animatorSet.setDuration(2000);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimator1,objectAnimator2);
        animatorSet.start();
    }
    public void playrun(View view){
        float cx = ball.getX();
        ObjectAnimator anim1 = ObjectAnimator.ofFloat(ball, "scaleX", 1.0f, 2f);
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(ball, "scaleY", 1.0f, 2f);
        ObjectAnimator anim3 = ObjectAnimator.ofFloat(ball, "x",  cx ,  0f);
        ObjectAnimator anim4 = ObjectAnimator.ofFloat(ball, "x", cx);
        AnimatorSet animSet = new AnimatorSet();
        animSet.play(anim1).with(anim2);
        animSet.play(anim2).with(anim3);
        animSet.play(anim4).after(anim3);
        animSet.setDuration(1000);
        animSet.start();
    }
}
