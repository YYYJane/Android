package com.example.weight;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by 吉木易潔 on 2017/4/29.
 */

public class Result extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView tv = (TextView)findViewById(R.id.show);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String sex = bundle.getString("sex");
        Double height = bundle.getDouble("height");
        Double weight;
        System.out.println(sex + "--------------------------------------------");
        if("M".equals(sex)){
            weight =(height-80)*0.7;
            System.out.println(weight+"11111111111111111111111111111111111111");
            tv.setText("你是一位男性" + "\n你的身高是" + height + "公分\n你的标准体重是" + weight + "公斤\n");
        }else{
            weight =(height-70)*0.6;
            System.out.println(weight+"222222222222222222222222222222222222222");
            tv.setText("你是一位女性"+"\n你的身高是"+ height +"公分\n你的标准体重是"+ weight + "公斤\n");
        }

    }
}