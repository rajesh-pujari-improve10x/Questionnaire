package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_choice);
        verifyBtn();
    }

    public void verifyBtn() {
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            RadioGroup radioGroup = findViewById(R.id.right_answer_rg);
            int selectedButtonId = radioGroup.getCheckedRadioButtonId();
            if(selectedButtonId == R.id.first_choice_btn) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.second_choice_btn) {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            } else if(selectedButtonId == R.id.third_choice_btn) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.fourth_choice_btn) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }

            /*RadioButton firstChoiceBtn = findViewById(R.id.first_choice_btn);
            if(firstChoiceBtn.isChecked()) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
            RadioButton secondChoiceBtn = findViewById(R.id.second_choice_btn);
            if (secondChoiceBtn.isChecked()) {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            }
            RadioButton thirdChoiceBtn = findViewById(R.id.third_choice_btn);
            if (thirdChoiceBtn.isChecked()){
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
            RadioButton forthChoiceBtn = findViewById(R.id.fourth_choice_btn);
            if(forthChoiceBtn.isChecked()) {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }*/
        });
    }
}