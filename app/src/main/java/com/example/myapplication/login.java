package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class login  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button bt1 = (Button)findViewById(R.id.button3);
        Button bt2 = (Button)findViewById(R.id.button4);


        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button3:
                Intent intent1 = new Intent(this,findpassword.class);
                startActivity(intent1);
                break;

            case R.id.button4:
                Intent intent2 = new Intent(this,MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
