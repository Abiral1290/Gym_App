package com.example.abiral.xampp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.example.abiral.xampp.R;

public class BMI_calculate extends AppCompatActivity {

    private EditText weight, height;
    private Button button;
    private TextView result;

    String Underweight1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculate);

        height = (EditText) findViewById(R.id.edit_height);
        weight = (EditText) findViewById(R.id.edit_weight);
        button = (Button) findViewById(R.id.btn_bmi);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculate(View view){
        String str_height = height.getText().toString();
        String str_weight = weight.getText().toString();

        if(str_height != null && !"".equals(str_height) && str_weight != null && !"".equals(str_weight)){
            float height_value = Float.parseFloat(str_height) * 0.3048f;
            float weight_value = Float.parseFloat(str_weight);

            float bmi = weight_value / (height_value * height_value);

            displayBMI(bmi);


        }

    }

    private void displayBMI(float bmi) {
        String bmila = "";

        if(Float.compare(bmi, 15f) <= 0){
            bmila = getString(R.string.extreme_severely_underweight);
        }else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0){
            bmila = getString(R.string.severely_underweight);
        } else if(Float.compare(bmi, 16) > 0 && Float.compare(bmi, 18.5f) <= 0){
            bmila = getString(R.string.underweight);
        } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0){
            bmila = getString(R.string.normal);
        }  else if (Float.compare(bmi, 25) > 0 && Float.compare(bmi, 30f) <= 0){
            bmila = getString(R.string.overweight);
        }  else if (Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0){
            bmila = getString(R.string.extreme_class_1);
        } else if (Float.compare(bmi, 35) > 0 && Float.compare(bmi, 40f) <= 0) {
            bmila = getString(R.string.extreme_class_2);
        } else {
            bmila = getString(R.string.extreme_class_3);
        }
        bmila = bmi + "\n\n" + bmila;
        result.setText(bmila);
    }
}
