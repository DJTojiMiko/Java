package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view){
        Button button = (Button) view;

        TextView result = findViewById(R.id.textResult);

        if(button.getText().equals("AC")){
            result.setText("0");
        }else { // if digits
            if(!result.getText().equals("0")) {
                String temp = result.getText().toString();
                result.setText(temp + button.getText());
            }else{
                result.setText(button.getText());
            }
        }
        //result.setText(button.getText());

    }
}
