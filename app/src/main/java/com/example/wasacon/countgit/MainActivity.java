package com.example.wasacon.countgit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    int i;
//unixコマンド
    //initiarise 最初の　初期化
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textview);
    }
    public void plus(View v){
        i = i + 1;
        text.setText(String.valueOf(i));
        if(i % 3 == 0){
            text.setTextColor(Color.rgb(10,128,128));
            text.setTextSize(50);
        }else{
            text.setTextColor(Color.rgb(0,0,0));
        }
    }
    public void minus(View v){
        i = i - 1;
        text.setText(String.valueOf(i));
        if(i % 3 == 0){
             text.setTextColor(Color.rgb(10,128,128));
             text.setTextSize(50);
        }else{
            text.setTextColor(Color.rgb(0,0,0));

        }
    }
}
