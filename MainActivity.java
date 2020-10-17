package com.example.myapplication3214891;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx=findViewById(R.id.textView);
        bt=findViewById(R.id.button);
        bt.setOnClickListener(myClickListener);
    }
    private View.OnClickListener myClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tx.setTextColor(Color.BLUE);
        }
    };

//    public void onButtonClick(View view){
//
//        tx.setTextColor(Color.BLUE);
//    }

}