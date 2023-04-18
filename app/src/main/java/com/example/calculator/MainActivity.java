package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calculator(View view){
        TextView res = findViewById(R.id.resultField);
        EditText first =findViewById(R.id.editTextText2);
        EditText second =findViewById(R.id.editTextText3);
        EditText operator =findViewById(R.id.editTextText4);

        Toast toast = Toast.makeText(this,"Не ломай систему",Toast.LENGTH_SHORT);

        int fir = Integer.parseInt(first.getText().toString());
        int sec = Integer.parseInt(second.getText().toString());
        String op = operator.getText().toString();
        int resul;
        switch (op){
            case("+"):
                resul = fir+sec;
                res.setText(Integer.toString(resul));
                break;
            case("-"):
                resul = fir-sec;
                res.setText(Integer.toString(resul));
                break;
            case("/"):
                resul = fir/sec;
                res.setText(Integer.toString(resul));
                break;
            case("*"):
                resul = fir*sec;
                res.setText(Integer.toString(resul));
                break;
            default:
                toast.show();
                break;
        }
    }
}
