package com.example.silence.handedit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by Silence on 2018/3/5.
 */

public class TitleLayout extends LinearLayout {// 自定义布局并在构造函数内部写好控件逻辑，就可以实现代码复用
    public TitleLayout(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
    }
}
