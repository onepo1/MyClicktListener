package com.example.edu.myclicktlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btn1;
    Button btn2;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        text1 = (TextView)findViewById(R.id.text1);

    }

    @Override
    public void onClick(View v) {
        String text = ((Button)v).getText().toString();

        if(v.getId() == R.id.btn1){
            text1.setText(text);
        }else{
            text1.setText(text);
        }
    }
}
