package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText a=(EditText)findViewById(R.id.EditText);
        final Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

                String call=a.getText().toString();
                if(PhoneNumberUtils.isGlobalPhoneNumber(call)){
                    Intent I=new Intent(Intent.ACTION_CALL, Uri.parse("tel://"+call));
                    try {
                        startActivity(I);
                    }catch (Exception e){

                    }
                }
                 else {
                    Toast.makeText(MainActivity.this,"你输入的号码不正确 ，请重新输入",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
