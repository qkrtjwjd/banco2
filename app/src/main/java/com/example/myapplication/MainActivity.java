package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button)findViewById(R.id.button2);
        Button bt2 = (Button)findViewById(R.id.button9);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                Intent intent1 = new Intent(this,details.class);
                startActivity(intent1);
                break;

            case R.id.button9:
                Intent intent2 = new Intent(this,menu.class);
                startActivity(intent2);
                break;
        }
    }
}