package com.example.a0520;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
CheckBox cb_red,cb_orange,cb_green,cb_blue;
TextView t1,t2,t3,t4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cb_red = findViewById(R.id.cb_red);
        cb_orange = findViewById(R.id.cb_orange);
        cb_green = findViewById(R.id.cb_green);
        cb_blue = findViewById(R.id.cb_blue);
        t1 = findViewById(R.id.textbox1);
        t2 = findViewById(R.id.textbox2);
        t3 = findViewById(R.id.textbox3);
        t4 = findViewById(R.id.textbox4);
    }

//    public void check1(View v){
//        if (cb_red.isChecked()){
//            CharSequence nowtext = outputtext.getText();
//            outputtext.setText(nowtext+" "+"RED");
//        } else {
//            outputtext.setText("");
//        }
//    };
//    public void check2(View v){
//        if (cb_orange.isChecked()){
//            CharSequence nowtext = outputtext.getText();
//            outputtext.setText(nowtext+" "+"ORANGE");
//        } else {
//            outputtext.setText("");
//        }
//    };
//    public void check3(View v){
//        if (cb_green.isChecked()){
//            CharSequence nowtext = outputtext.getText();
//            outputtext.setText(nowtext+" "+"GREEN");
//        } else {
//            outputtext.setText("");
//        }
//    };
//    public void check4(View v){
//        if (cb_blue.isChecked()){
//            CharSequence nowtext = outputtext.getText();
//            outputtext.setText(nowtext+" "+"BLUE");
//        } else {
//            outputtext.setText("");
//        }
//    };
    public void check1(View v){
        if (cb_red.isChecked()){
            t1.setVisibility(View.VISIBLE);
        } else {
            t1.setVisibility(View.INVISIBLE);
        }
    }
    public void check2(View v){
        if (cb_orange.isChecked()){
            t2.setVisibility(View.VISIBLE);
        } else {
            t2.setVisibility(View.INVISIBLE);
        }
    }
    public void check3(View v){
        if (cb_green.isChecked()){
            t3.setVisibility(View.VISIBLE);
        } else {
            t3.setVisibility(View.INVISIBLE);
        }
    }public void check4(View v){
        if (cb_blue.isChecked()){
            t4.setVisibility(View.VISIBLE);
        } else {
            t4.setVisibility(View.INVISIBLE);
        }
    }

}