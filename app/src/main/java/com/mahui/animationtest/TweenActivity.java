package com.mahui.animationtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/9/29.
 */
public class TweenActivity extends AppCompatActivity {
    private ImageView iv_dongxiao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dongxiao);
        iv_dongxiao= (ImageView) findViewById(R.id.iv_dongxiao);
    }
    public void touming(View view){
        //xml
        iv_dongxiao.startAnimation(AnimationUtils.loadAnimation(this,R.anim.touming));
        // 1.0f代表完全不透明
        // 0.0f代表完全透明
        /*float fromAlpha = 1.0f;
        float toAlpha = 0.0f;
        AlphaAnimation aa = new AlphaAnimation(fromAlpha, toAlpha);

        // 动画的配置
        aa.setDuration(2 * 1000); // 动画持续多久
        aa.setFillAfter(true); // 设为true之后,界面会停留在动画播放完时的界面
        aa.setRepeatCount(1); // 设置动画重复的次数
        aa.setRepeatMode(Animation.RESTART); // 动画重启或逆转，默认值为重启动画

        // 启动动画
        iv_dongxiao.startAnimation(aa);*/
    }
    public void xuanzhuan(View view){
        //xml
        iv_dongxiao.startAnimation(AnimationUtils.loadAnimation(this,R.anim.xuanzhuan));
        // 旋转的起始角度
        /*float fromDegrees = 0;
        // 旋转的目标角度
        float toDegrees = 360;

        // 旋转的X轴中心点类型
        // 分为三种类型：Animation.ABSOLUTE, Animation.RELATIVE_TO_SELF,Animation.RELATIVE_TO_PARENT.
        // X轴的原点的类型（相对于自己而言还是相对于父容器而言）
        int pivotXType = Animation.RELATIVE_TO_SELF;

        // 旋转的X轴坐标的值，一般被指定为一个百分比数；1.0代表着100%
        // 开始伸缩时的X轴的原点(例:0.5就是指以图片宽度的二分之一的位置作为X轴的原点)
        float pivotXValue = 0.0f;

        // Y轴的原点的类型
        int pivotYType = Animation.RELATIVE_TO_SELF;
        // 开始伸缩时的Y轴的原点
        float pivotYValue = 0.0f;
        *//*
        *这里对pivotXValue和pivotYValue的值详细说明一下
        *在Android中的坐标轴Y轴向下是增张的，X轴向右是增长的；
         *pivotXValue在API中被说明为：旋转的X轴坐标的值，一般被指定为一个百分比数；1.0代表着100%
        *也就是说，当我们指定为0.0f时，代表作是图片的X轴的0点；当指定为0.5f时，代表图片的width/2的位置；当被指定为1.0f时，代表图片的width位置；
        *//*
        RotateAnimation ra = new RotateAnimation(fromDegrees, toDegrees, pivotXType, pivotXValue, pivotYType, pivotYValue);

        // 动画的配置
        ra.setDuration(2 * 1000); // 动画持续多久
        ra.setRepeatCount(1); // 设置动画重复的次数
        ra.setStartOffset(2 * 1000); // 设置动画启动时间的偏移量，简单来说就是多长时间后启动动画

        // 启动动画
        iv_dongxiao.startAnimation(ra);*/
    }
    public void suofang(View view){
        //xml
        iv_dongxiao.startAnimation(AnimationUtils.loadAnimation(this,R.anim.suofang));

        // 0.0f代表0点的位置；0.5f代表图片宽度的一半的位置；1.0f代表图片整个图片宽度的位置；2.0f代表整个图片宽度的2倍；
        // 水平方向比例尺的起始值
        /*float fromX = 0.0f;
        // 水平方向比例尺的终值
        float toX = 2.0f;

        // 垂直方向比例尺的起始值
        float fromY = 0.0f;
        // 垂直方向比例尺的终值
        float toY = 2.0f;

        // X轴的原点的类型（相对于自己而言还是相对于父容器而言）
        int pivotXType = Animation.RELATIVE_TO_SELF;
        // 开始伸缩时的X轴的原点(例:0.5就是指以图片宽度的二分之一的位置作为X轴的原点)
        float pivotXValue = 0.0f;
        int pivotYType = Animation.RELATIVE_TO_SELF;
        float pivotYValue = 0.0f;
        ScaleAnimation sa = new ScaleAnimation(fromX, toX, fromY, toY, pivotXType, pivotXValue, pivotYType, pivotYValue);
        sa.setDuration(2 * 1000);

        // 整个动画会呈现，从左上角向右下加放大2倍
        iv_dongxiao.startAnimation(sa);*/
    }
    public void weiyi(View view){
        //xml
        iv_dongxiao.startAnimation(AnimationUtils.loadAnimation(this,R.anim.weiyi));
        // 位移的x轴起始坐标的类型(相对于自己还是相对父容器)
        /*int fromXType = Animation.RELATIVE_TO_PARENT;
        // x轴起点
        float fromXValue = -0.5f;
        int toXType = Animation.RELATIVE_TO_PARENT;
        // X轴的终点
        float toXValue = 0.5f;

        int fromYType = Animation.RELATIVE_TO_PARENT;
        // Y轴的起始坐标
        float fromYValue = -0.5f;
        int toYType = Animation.RELATIVE_TO_PARENT;
        // Y轴的终点坐标
        float toYValue = 0.5f;

        TranslateAnimation ta = new TranslateAnimation(fromXType, fromXValue, toXType, toXValue, fromYType, fromYValue, toYType, toYValue);
        ta.setDuration(2 * 1000);

        iv_dongxiao.startAnimation(ta);*/
    }
    public void donghuaheji(View view){
        //xml
        iv_dongxiao.startAnimation(AnimationUtils.loadAnimation(this,R.anim.donghuaheji));
        /*AnimationSet set = new AnimationSet(false);

        ScaleAnimation  sa = new ScaleAnimation(0.1f, 2.0f, 0.1f, 2.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        sa.setDuration(3000); //设置动画的时间
        sa.setRepeatCount(1); //设置动画的显示次数
        sa.setRepeatMode(AlphaAnimation.REVERSE);//设置播放模式

        RotateAnimation ra = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);

        ra.setDuration(3000); //设置动画的时间
        ra.setRepeatCount(1); //设置动画的显示次数
        ra.setRepeatMode(AlphaAnimation.REVERSE);//设置播放模式


        TranslateAnimation ta = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, -0.5f, Animation.RELATIVE_TO_PARENT, 0.5f, Animation.RELATIVE_TO_PARENT, -0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);
        ta.setDuration(3000); //设置动画的时间
        ta.setRepeatCount(1); //设置动画的显示次数
        ta.setRepeatMode(AlphaAnimation.REVERSE);//设置播放模式

        set.addAnimation(sa);
        set.addAnimation(ta);
        set.addAnimation(ra);

        //播放动画
        iv_dongxiao.startAnimation(set);*/
    }
}
