package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class addaccountnumber extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addaccountnumber);

        }

    @Override
    public void onClick(View view){
        switch (view.getId()){
        case R.id.button:
            Intent intent1 = new Intent(this,MainActivity.class);
            startActivity(intent1);
            break;
    }
}
}
