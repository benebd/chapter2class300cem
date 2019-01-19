package com.example.itst.chapter2class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button runPETbtn = findViewById(R.id.runpetbtn);
        Button runDISbtn = findViewById(R.id.rundiebtn);
//        EditText makeET =findViewById(R.id.makeedt);
//        EditText yearET=findViewById(R.id.yearedt);
//        EditText colorET=findViewById(R.id.coloredt);




        runPETbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText makeET =findViewById(R.id.makeedt);
                EditText yearET=findViewById(R.id.yearedt);
                EditText colorET=findViewById(R.id.coloredt);
                final String stMake = makeET.getText().toString();
                final String stYear = yearET.getText().toString();
                final String stColor = colorET.getText().toString();
                Car car = new Car(stMake,stYear,stColor);

                showToast(car.getMake(),car.getYear(),car.getYear());
            }
        });

        runDISbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void showToast(String STmake,String STyear,String STcolor){

        Toast.makeText(this, STmake+STyear+STcolor, Toast.LENGTH_SHORT).show();
    }
}
