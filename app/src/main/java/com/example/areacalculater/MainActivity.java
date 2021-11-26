package com.example.areacalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity {
    EditText mEditlength;
    Button mButtonCount;
    TextView mTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditlength = (EditText) findViewById(R.id.editTextTextPersonName);
        mButtonCount= (Button)  findViewById(R.id.button);
        mTextResult = (TextView) findViewById(R.id.textView3);

        mButtonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }
    public void calculate(){
        Double value1 = Double.parseDouble(mEditlength.getText().toString());
        Double calculateValue = value1*value1;
        mTextResult.setText(calculateValue.toString());
    }
}