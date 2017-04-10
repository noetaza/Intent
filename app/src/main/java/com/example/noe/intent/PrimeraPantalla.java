package com.example.noe.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class PrimeraPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);

        //Comunicacion entre Activities
        //Intent in = new Intent(this, SecondActivity.class);
        //in.putExtra("valorTest", "false");
        //startActivity(in);

    }

    public void salta(View view){
        Log.d("App", "Se ha hecho click");
        Intent intent= new Intent(this, Segunda.class);
        startActivity(intent);
    }

}
