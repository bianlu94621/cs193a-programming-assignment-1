package com.example.bianbiandediannao.tipscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double rate;
    private double money;
    private double tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipsClick(View view) {
        if (view.getId() == R.id.rate5) {
            rate = 0.05;
        } else if (view.getId() == R.id.rate10) {
            rate = 0.1;
        } else if (view.getId() == R.id.rate15) {
            rate = 0.15;
        } else if (view.getId() == R.id.rate20) {
            rate = 0.20;
        } else if (view.getId() == R.id.rate25) {
            rate = 0.25;
        }
    }

    public void okClick(View view) {
        EditText m = (EditText) findViewById(R.id.money);
        // How to get the content in the text field??
        money = Double.parseDouble(m.getText().toString());

        tips = rate * money;
        money += tips;

        TextView result = (TextView) findViewById(R.id.result);
        result.setText("Total: " + String.valueOf(money) + "\n" + "Tips: " + String.valueOf(tips));

    }
}