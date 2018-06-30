package com.patialashahi.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    public void clickKro(View view){
       EditText rupee = (EditText) findViewById(R.id.rupee);
       Double a , b;
       a= Double.parseDouble(rupee.getText().toString());
       b = a * 65.57;
        Toast.makeText(MainActivity.this, "Rs"+ String.format("%.2f",b), Toast.LENGTH_SHORT).show();
        Log.i("info",rupee.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
