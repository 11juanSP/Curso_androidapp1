package com.example.calculadorasimple;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculadorasimple.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    private EditText N1;
    private EditText N2;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        N1 = findViewById(R.id.editTextNumber);
        N2 = findViewById(R.id.editTextNumber2);
        Resultado = findViewById(R.id.textView5);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText(suma(Integer.parseInt(N1.getText().toString()),Integer.parseInt(N2.getText().toString()) )+"");
            }
        });

        button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText(resta(Integer.parseInt(N1.getText().toString()),Integer.parseInt(N2.getText().toString()) )+"");
            }
        });

        button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText(multiplicacion(Integer.parseInt(N1.getText().toString()),Integer.parseInt(N2.getText().toString()) )+"");
            }
        });

        button3 = findViewById(R.id.button4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText(division(Integer.parseInt(N1.getText().toString()),Integer.parseInt(N2.getText().toString()) )+"");
            }
        });



    }

    public int suma (int a, int b){
        return a+b;
    }

    public int resta (int a, int b){
        return a-b;
    }

    public int multiplicacion (int a, int b){
        return a*b;
    }

    public int division (int a, int b){
        return a/b;
    }


}