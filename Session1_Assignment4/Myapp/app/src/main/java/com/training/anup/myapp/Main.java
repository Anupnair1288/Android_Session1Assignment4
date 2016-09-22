package com.training.anup.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    public Button But1;

    public void init() {
        But1= (Button)findViewById(R.id.But1);
        But1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myactivity = new Intent(Main.this, Second.class);
                startActivity(myactivity);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}