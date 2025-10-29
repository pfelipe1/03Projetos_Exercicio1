package com.example.exercicio1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    /*
     *@author: Felipe Pires de Araujo
     */

    /*
    Felipe Pires de Araujo
    1110482412004
    */

    private EditText etEtanol;
    private EditText etGasolina;
    private TextView tvRes;





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

        etEtanol = findViewById(R.id.etEtanol);
        etEtanol.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        etGasolina = findViewById(R.id.etGasolina);
        etGasolina.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tvRes = findViewById(R.id.tvRes);
        tvRes.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TextView tvTitulo = findViewById(R.id.tvTitulo);
        tvTitulo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        Button btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(op -> CalcularIdeal());
    }

    private void CalcularIdeal() {
        float sEtanol = Float.parseFloat(etEtanol.getText().toString());
        float sGasolina = Float.parseFloat(etGasolina.getText().toString());
        String alt1 = getString(R.string.alt1);
        String res;
        if (sEtanol < (sGasolina * 0.7)){
            res = alt1 + " " + "Etanol";
        }
            else {
            res = alt1 + " " + "Gasolina";
        }
        tvRes.setText(res);

    }
    }
