package com.example.layoutconstraint;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txt1=(EditText) this.findViewById(R.id.editTextTextPersonName9);
        txt2=(EditText) this.findViewById(R.id.editTextTextEmailAddress3);
        txt3=(EditText) this.findViewById(R.id.editTextPhone3);
        txt4=(EditText) this.findViewById(R.id.editTextTextMultiLine3);
        txt5=(EditText) this.findViewById(R.id.editTextTextPersonName10);
        txt6=(EditText) this.findViewById(R.id.editTextTextPersonName11);
        txt7=(EditText) this.findViewById(R.id.editTextTextPersonName12);
        b1=(Button) this.findViewById(R.id.button5);


    }


    public void onClick(View view) {
        String Name=txt1.getText().toString();
        String Email=txt2.getText().toString();
        String phone =txt3.getText().toString();
        String Description =txt4.getText().toString();
        String FinalDegree =txt5.getText().toString();
        String skill=txt6.getText().toString();
        String Experience =txt7.getText().toString();
        Intent intent=new Intent(MainActivity3.this,MainActivity.class);

        intent.putExtra("K1",Name);
        intent.putExtra("K2",Email);
        intent.putExtra("K3",phone);
        intent.putExtra("K4",Description);
        intent.putExtra("K5",FinalDegree);
        intent.putExtra("K6",skill);
        intent.putExtra("K7",Experience);
        startActivity(intent);
    }
}

