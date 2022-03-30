package com.androidapp.classtask;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int font=30;
 int colorr=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text1);
        Button fontbtn = (Button) findViewById(R.id.btn1);
        Button colorbtn =(Button) findViewById(R.id.btn2);
        fontbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextSize(font);
                font=font+4;
                if(font>=40)
                    font=15;
            }
        });
        colorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorr++;
                switch(colorr){
                    case 1:
                        text.setTextColor(Color.YELLOW);
                        break;
                    case 2:
                        text.setTextColor(Color.GREEN);
                        break;
                }
                if(colorr>2)
                    colorr=1;
            }
        });

    }
}