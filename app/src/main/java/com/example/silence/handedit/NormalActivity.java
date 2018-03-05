package com.example.silence.handedit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NormalActivity extends Activity {

    public static void actionStart(Context context,String data){// 启动并获取数据，可以用于登录
        Intent intent = new Intent(context,NormalActivity.class);
        intent.putExtra("param1",data);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Intent intent = getIntent();// 获取传递过来的intent
        String data = intent.getStringExtra("param1");
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(data);
    }
}
