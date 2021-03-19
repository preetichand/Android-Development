package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=new Intent(MainActivity2.this,MainActivity.class);
        button=findViewById(R.id.button2);
        String data=getIntent().getStringExtra("msg1");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("msg2","Welcome"+data);
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}