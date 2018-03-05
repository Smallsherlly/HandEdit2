package com.example.silence.handedit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NormalActivity extends Activity {

    public static void actionStart(Context context,String data){
        Intent intent = new Intent(context,NormalActivity.class);
        intent.putExtra("param1",data);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Intent intent = getIntent();
        String data = intent.getStringExtra("param1");
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(data);
    }
}
