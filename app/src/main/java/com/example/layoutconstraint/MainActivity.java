package com.example.layoutconstraint;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    Button bt1,bt2;
    String email=null, phone=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) this.findViewById(R.id.textView);
        t2 = (TextView) this.findViewById(R.id.textView4);
        t3 = (TextView) this.findViewById(R.id.textView5);
        t4 = (TextView) this.findViewById(R.id.textView6);
        t5 = (TextView) this.findViewById(R.id.textView7);
        t6 = (TextView) this.findViewById(R.id.textView8);
        t7 = (TextView) this.findViewById(R.id.textView9);
        t8 = (TextView) this.findViewById(R.id.textView11);

        bt1 = (Button) this.findViewById(R.id.button);
        bt2 = (Button) this.findViewById(R.id.button2);

        String name = getIntent().getStringExtra("K1");
        String Description = getIntent().getStringExtra("K4");
        String FinalDegree = getIntent().getStringExtra("K5");
        String skill = getIntent().getStringExtra("K6");
        String experience = getIntent().getStringExtra("K7");

        t1.setText(name);
        t2.setText(Description);
        t3.setText(FinalDegree);
        t4.setText(skill);
        t5.setText(experience);


    }

    public void dial(View view) {
        Intent Intent=getIntent();
        String phone=Intent.getStringExtra("K3");
        Uri uri=Uri.parse("tel:" +phone);
        Intent it=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);

    }

    public void Mail(View view) {
        Intent Intent=getIntent();
        String email=Intent.getStringExtra("K2");
        Uri uri=Uri.parse("mailto:" +email);
        Intent it=new Intent(Intent.ACTION_SENDTO,uri);
        startActivity(it);


    }

    }




