package com.example.myapplication8;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button a,b,c,e;
    int r=255,g=204,bl=85;
    RelativeLayout d;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d=(RelativeLayout)findViewById(R.id.name_view);

        a=(Button)findViewById(R.id.button);
        b=(Button)findViewById(R.id.button2);
        c=(Button)findViewById(R.id.button3);
        e=(Button)findViewById(R.id.button4);
        ed=(EditText)findViewById(R.id.editText);
        ed.setText("Red="+r+" Green="+g+" Blue="+bl);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            r+=50;
                if(r>256)
                    r=0;
                d.setBackgroundColor(Color.rgb(r,g,bl));
                ed.setText("Red="+r+" Green="+g+" Blue="+bl);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g+=50;
                if(g>256)
                    g=0;
                d.setBackgroundColor(Color.rgb(r,g,bl));
                ed.setText("Red="+r+" Green="+g+" Blue="+bl);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bl+=50;
                if(bl>256)
                    bl=0;
                d.setBackgroundColor(Color.rgb(r,g,bl));
                ed.setText("Red="+r+" Green="+g+" Blue="+bl);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r=0;
                g=0;
                bl=0;
                d.setBackgroundColor(Color.rgb(r,g,bl));
                ed.setText("Red="+r+" Green="+g+" Blue="+bl);
                ed.setTextColor(Color.WHITE);
            }
        });
        setContentView(d);
    }
}
