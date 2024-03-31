package com.example.app_001_leddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean ledon = false;
    private Button button =null;
    private CheckBox checkBox1 = null;
    private CheckBox checkBox2 = null;
    private CheckBox checkBox3 = null;
    private CheckBox checkBox4 = null;

class MyButtonListener implements  View.OnClickListener{
    @Override
    public void onClick(View v) {
        ledon = !ledon;
        if (ledon) {
            button.setText("ALL OFF");
            checkBox1.setChecked(true);
            checkBox2.setChecked(true);
            checkBox3.setChecked(true);
            checkBox4.setChecked(true);
        }
        else {
            button.setText("ALL ON");
            checkBox1.setChecked(false);
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
        }
    }
}

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        int viewId = view.getId();

        if (viewId == R.id.LED1) {
            if (checked) {
                Toast.makeText(this, "LED1_ON!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "LED1_OFF!", Toast.LENGTH_SHORT).show();
            }
        } else if (viewId == R.id.LED2) {
            if (checked) {
                Toast.makeText(this, "LED2_ON!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "LED2_OFF!", Toast.LENGTH_SHORT).show();
            }
        } else if (viewId == R.id.LED3) {
            if (checked) {
                Toast.makeText(this, "LED3_ON!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "LED3_OFF!", Toast.LENGTH_SHORT).show();
            }
        } else if (viewId == R.id.LED4) {
            if (checked) {
                Toast.makeText(this, "LED4_ON!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "LED4_OFF!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        checkBox1 = (CheckBox) findViewById(R.id.LED1);
        checkBox2 = (CheckBox) findViewById(R.id.LED2);
        checkBox3 = (CheckBox) findViewById(R.id.LED3);
        checkBox4 = (CheckBox) findViewById(R.id.LED4);
        button.setOnClickListener(new MyButtonListener());
    }
}