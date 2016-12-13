package com.mahui.animationtest;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {
    private ImageView imageView,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        AnimationDrawable animationDrawable = (AnimationDrawable)(imageView2).getDrawable();
        animationDrawable.start();
    }
    public void addanim(View view){
        AnimationDrawable anim=new AnimationDrawable();
        for(int i=1;i<=4;i++){
            int id=getResources().getIdentifier("loading_progress_"+i,"mipmap",getPackageName());
            Drawable drawable=getResources().getDrawable(id);
            anim.addFrame(drawable,300);
        }
        anim.setOneShot(false);
        imageView.setBackgroundDrawable(anim);
        anim.start();
    }
}
