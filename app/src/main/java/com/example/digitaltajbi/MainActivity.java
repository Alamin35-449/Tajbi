package com.example.digitaltajbi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView display;
   TextView find;
   Button add,sub,reset;

   int count =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         find=findViewById(R.id.find);
         display =findViewById(R.id.display);
         add =findViewById(R.id.add);
         sub =findViewById(R.id.sub);
         reset=findViewById(R.id.reset);

         // this is onclick lisoner================================
        //  ===============add===========================================

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code here
                count++;
                display.setText(""+count);


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code here
                count--;
                display.setText(""+count);

            }
        });



        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                display.setText(""+count);

            }
        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(MainActivity.this,newActivity2.class);
                startActivity(myIntent);
            }
        });


    }
}