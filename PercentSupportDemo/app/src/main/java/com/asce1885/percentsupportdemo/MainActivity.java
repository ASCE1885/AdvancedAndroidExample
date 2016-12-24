package com.asce1885.percentsupportdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.example_one).setOnClickListener(mOnClickListener);
        findViewById(R.id.example_second).setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.example_one:
                    Intent intent = new Intent(MainActivity.this, ExampleOne.class);
                    startActivity(intent);
                    break;
                case R.id.example_second:
                    Intent intent2 = new Intent(MainActivity.this, ExampleSecond.class);
                    startActivity(intent2);
                    break;
                default:
                    break;
            }
        }
    };
}
