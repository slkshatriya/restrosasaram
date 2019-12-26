package com.xiken.restrosasaram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class screen2 extends AppCompatActivity {
    private Button button;
    TextView textView,textview6,textview3,textview4,textview5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        textView=(TextView) findViewById(R.id.textView);
        textview6=(TextView) findViewById(R.id.textView6);
        textview3=(TextView) findViewById(R.id.textView3);
        textview4=(TextView) findViewById(R.id.textView4);
        textview5=(TextView) findViewById(R.id.textView5);
        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }
    public void openActivity3() {
        Intent intent1=new Intent(this,screen3.class);
        startActivity(intent1);
    }
}
