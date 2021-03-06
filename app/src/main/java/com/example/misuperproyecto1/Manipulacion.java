package com.example.misuperproyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Manipulacion  extends AppCompatActivity {
    EditText edtnombre;
    EditText edtmonto;
    TextView txtresultado;
    Button btncambiar;
    Button btnver;
    int centinela=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        edtnombre=findViewById(R.id.edtnombre);
        edtmonto=findViewById(R.id.edtmonto);
        txtresultado=findViewById(R.id.txtResultado);
        btncambiar=findViewById(R.id.btncambiar);
        btnver=findViewById(R.id.btnvisibilidad);



        btncambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double cambio;
                cambio=Double.parseDouble(edtmonto.getText().toString())*3.3;
                txtresultado.setText(edtnombre.getText() + " el monto de "+ edtmonto.getText()+
                        " dolares equivale a " + cambio.toString() + "Soles");
            }
        });
    }

    public void ocultar(View view){

        if(centinela==0){
            btncambiar.setVisibility(View.GONE);
            centinela=1;
            btnver.setText("Mostrar");
        }
        else{
            btncambiar.setVisibility(View.VISIBLE);
            centinela=0;
            btnver.setText("Ocultar");
        }

    }
}