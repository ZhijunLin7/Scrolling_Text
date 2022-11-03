package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button añadir ;
    Boolean abierto;
    EditText comen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout li = (LinearLayout) findViewById(R.id.linearlayout);

        añadir =(Button) findViewById(R.id.boton_añadir);
        abierto = false;


        añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (abierto==false){
                    comen = new EditText(MainActivity.this);
                    li.addView(comen,2);
                    abierto=true;
                }else {
                    li.removeView(comen);
                    TextView comentario = new TextView(MainActivity.this);
                    String txt  = comen.getText().toString();
                    comentario.setText(txt);
                    li.addView(comentario);
                    abierto=false;

                }

            }
        });

    }
}