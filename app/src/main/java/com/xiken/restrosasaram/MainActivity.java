package com.xiken.restrosasaram;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView toptext;
    ImageView imageView;
    private Button btn,btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toptext=(TextView) findViewById(R.id.toptext);
        btn=(Button) findViewById(R.id.btn);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        imageView=(ImageView) findViewById(R.id.imageView3);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openActivity2();
           }
       });
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               openActivity4();
           }
       });
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
               builder.setMessage("are you sure you want to exit");
               builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int i) {
                       MainActivity.this.finish();
                   }
               }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int i) {
                       dialog.cancel();

                   }
               });
               AlertDialog alert=builder.create();
               alert.show();
           }
       });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, screen2.class);
        startActivity(intent);
    }
    public void openActivity4() {
        Intent inten4 = new Intent(this, screen4.class);
        startActivity(inten4);
    }

}
