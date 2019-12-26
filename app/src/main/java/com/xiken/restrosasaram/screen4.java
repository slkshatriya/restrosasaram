package com.xiken.restrosasaram;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class screen4 extends AppCompatActivity {
    TextView txtvw4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        txtvw4=(TextView) findViewById(R.id.txtvw4);
    }
}
