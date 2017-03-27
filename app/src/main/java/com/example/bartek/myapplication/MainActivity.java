package com.example.bartek.myapplication;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.Button1);
        Button btn2 = (Button)findViewById(R.id.Button2);
        Button btn3 = (Button)findViewById(R.id.Button3);
        Button submit = (Button)findViewById(R.id.submit);
        final TextView textview1 = (TextView)findViewById(R.id.text1);
        final TextView textview2 = (TextView)findViewById(R.id.text2);
        final EditText name = (EditText)findViewById(R.id.name);
        final EditText surname = (EditText)findViewById(R.id.surname);


        btn1.setOnClickListener(new View.OnClickListener(){ public void onClick(View view){textview1.setText("prz1");}});
        btn2.setOnClickListener(new View.OnClickListener(){ public void onClick(View view){textview1.setText("prz2");}});
        btn3.setOnClickListener(new View.OnClickListener(){ public void onClick(View view){textview1.setText("przycisk 33");}});
        submit.setOnClickListener(new View.OnClickListener(){public void onClick(View view){textview2.setText(name.getText()+" "+surname.getText());}});
    }
}
