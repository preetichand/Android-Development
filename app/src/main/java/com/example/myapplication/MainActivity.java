package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        button=findViewById(R.id.button);
        text=findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                i.putExtra("msg1",text.getText().toString());
                startActivityForResult(i,001);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            text.setText(data.getStringExtra("msg2"));
        }
    }
}