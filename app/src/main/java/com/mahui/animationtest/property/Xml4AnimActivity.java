package com.mahui.animationtest.property;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mahui.animationtest.R;

/**
 * Created by Administrator on 2016/12/12.
 */

public class Xml4AnimActivity extends Activity{
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_4_anim);
        imageView= (ImageView) findViewById(R.id.imageView);
    }
    public void scaleX(View view){
        Animator animator= AnimatorInflater.loadAnimator(this,R.animator.scalex);
        animator.setTarget(imageView);
        animator.start();
    }
    public void scaleXandScaleY(View view){
        Animator animator=AnimatorInflater.loadAnimator(this,R.animator.scale);
        imageView.setPivotX(0);
        imageView.setPivotY(0);
        imageView.invalidate();
        animator.setTarget(imageView);
        animator.start();
    }
}
