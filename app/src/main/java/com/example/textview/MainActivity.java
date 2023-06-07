package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1=findViewById(R.id.Number1);
        EditText number2=findViewById(R.id.Number2);
        TextView sum=findViewById(R.id.textView);
        Button btn=findViewById(R.id.add);
        Button diff=findViewById(R.id.diff);
        Button mul=findViewById(R.id.mult);
        Button div=findViewById(R.id.div);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String n1=number1.getText().toString();
                String n2=number2.getText().toString();
                sum.setText(""+sum(n1,n2));
            }
        });
        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=number1.getText().toString();
                String n2=number2.getText().toString();
                sum.setText(""+sub(n1,n2));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=number1.getText().toString();
                String n2=number2.getText().toString();
                sum.setText(""+muliply(n1,n2));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=number1.getText().toString();
                String n2=number2.getText().toString();
                sum.setText(""+divide(n1,n2));
            }
        });
    }
    public int convertintonumber(String str){
        int i = 0;
        int num = 0;
        boolean isNeg = false;


        if (str.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }


        while( i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0';
        }

        if (isNeg)
            num = -num;
        return num;
    }

    public int sum(String s1, String s2){
        return convertintonumber(s1)+convertintonumber(s2);
    }
    public int sub(String s1, String s2){
        return convertintonumber(s1)-convertintonumber(s2);
    }
    public int muliply(String s1, String s2){
        return convertintonumber(s1)*convertintonumber(s2);
    }
    public int divide(String s1, String s2){
        return convertintonumber(s1)/convertintonumber(s2);
    }
}