package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button bt1 = (Button)findViewById(R.id.button);
        Button bt2 = (Button)findViewById(R.id.button2);
        Button bt3 = (Button)findViewById(R.id.button4);
        Button bt4 = (Button)findViewById(R.id.button5);
        Button bt5 = (Button)findViewById(R.id.button6);
        Button bt6 = (Button)findViewById(R.id.button7);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent intent1 = new Intent(this,profile.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                Intent intent2 = new Intent(this,notice.class);
                startActivity(intent2);
                break;

            case R.id.button4:
                Intent intent3 = new Intent(this,settlementcheck.class);
                startActivity(intent3);
                break;

            case R.id.button5:
                Intent intent4 = new Intent(this,accountmanagement.class);
                startActivity(intent4);
                break;

            case R.id.button6:
                Intent intent5 = new Intent(this,activityhistory.class);
                startActivity(intent5);
                break;

            case R.id.button7:
                Intent intent6 = new Intent(this,setting.class);
                startActivity(intent6);
                break;

        }
    }
}