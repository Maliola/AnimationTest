package com.mahui.animationtest.property;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.mahui.animationtest.R;

/**
 * Created by Administrator on 2016/12/12.
 */

public class ValueAnimatorActivity extends Activity{
    private ImageView id_ball;
    private float mScreenHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.value_layout);
        DisplayMetrics outMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(outMetrics);
        mScreenHeight = outMetrics.heightPixels;
        id_ball= (ImageView) findViewById(R.id.id_ball);
    }

    /**
     * 垂直
     * @param view
     */
    public void verticalRun(View view){
        /*ValueAnimator animator = ValueAnimator.ofFloat(0, mScreenHeight - mBlueBall.getHeight());
        animator.setTarget(mBlueBall);
        animator.setDuration(1000).start();
        // animator.setInterpolator(value)
        animator.addUpdateListener(new AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                mBlueBall.setTranslationY((Float) animation.getAnimatedValue());
            }
        });*/
        ValueAnimator animator=ValueAnimator.ofFloat(0,mScreenHeight-id_ball.getHeight());
        animator.setTarget(id_ball);
        animator.setDuration(1000).start();
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                id_ball.setTranslationY((Float) animation.getAnimatedValue());
            }
        });
    }

    /**
     * 抛物线
     * @param view
     */
    public void paowuxian(View view){
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(3000);
        valueAnimator.setObjectValues(new PointF(0, 0));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setEvaluator(new TypeEvaluator<PointF>() {
            // fraction = t / duration
            @Override
            public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
                // x方向200px/s ，则y方向0.5 * g * t (g = 100px / s*s)
                PointF point = new PointF();
                point.x = 200 * fraction * 3;
                point.y = 0.5f * 100 * (fraction * 3) * (fraction * 3);
                return point;
            }
        });

        valueAnimator.start();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                PointF point = (PointF) animation.getAnimatedValue();
                id_ball.setX(point.x);
                id_ball.setY(point.y);
            }
        });
    }

    /**
     * 淡出且删除
     * @param view
     */
    public void fadeOut(View view){
        ObjectAnimator anim = ObjectAnimator.ofFloat(id_ball, "alpha", 0.5f);
        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                ViewGroup parent = (ViewGroup) id_ball.getParent();
                if (parent != null)
                    parent.removeView(id_ball);
            }
        });

        anim.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {}

            @Override
            public void onAnimationRepeat(Animator animation) {}
            @Override
            public void onAnimationEnd(Animator animation) {
                ViewGroup parent = (ViewGroup) id_ball.getParent();
                if (parent != null)
                    parent.removeView(id_ball);
            }

            @Override
            public void onAnimationCancel(Animator animation) {}
        });
        anim.start();
    }
}
