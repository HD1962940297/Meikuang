package hdd.com.meikuang.fengji;


import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import hdd.com.meikuang.R;


public class Fragment1 extends Fragment{

    private CircleProgressView mCircleProgressView;
    private CircleProgressView mCircleProgressView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_frangment1, container, false);

        mCircleProgressView = (CircleProgressView) view.findViewById(R.id.F1_circle_view);

        //进度条从0到100
        ValueAnimator animator = ValueAnimator.ofFloat(0, 75);
        animator.setDuration(3000);
        animator.setInterpolator(new LinearInterpolator());
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float current = (float) animation.getAnimatedValue();
                mCircleProgressView.setmCurrent((int) current);
            }
        });
        animator.start();

        mCircleProgressView2 = (CircleProgressView) view.findViewById(R.id.F2_circle_view);

        //进度条从0到100
        ValueAnimator animator2 = ValueAnimator.ofFloat(0, 60);
        animator2.setDuration(60/25*1000);
        animator2.setInterpolator(new LinearInterpolator());
        animator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float current = (float) animation.getAnimatedValue();
                mCircleProgressView2.setmCurrent((int) current);
            }
        });
        animator2.start();

        /*CircleProgressView.setOnLoadingCompleteListener(new CircleProgressView.OnLoadingCompleteListener() {
            @Override
            public void complete() {
             //  Toast.makeText(fengjiActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
            }
        });*/
        return view;
    }

}
