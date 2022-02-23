package com.example.g_atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private EditText input;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Layout da tela
        btn1=(Button) findViewById(R.id.botaoEnviar);
        input=(EditText) findViewById(R.id.input);
        texto=(TextView) findViewById(R.id.texto);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.botaoEnviar){
            texto.setText(input.getText());
            Context context = getApplicationContext();
            CharSequence text = input.getText();
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}