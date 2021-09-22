package com.mdiaz.evaluacionu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.editNombres);
    }

    public void confirmarPedido(View view){
        Toast.makeText(this,nombre.getText() + ", pedido confimado!", Toast.LENGTH_LONG).show();
    }

}