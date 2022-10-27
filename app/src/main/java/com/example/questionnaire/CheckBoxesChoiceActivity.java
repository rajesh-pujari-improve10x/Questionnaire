package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxesChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes_choice);
        verifyBtn();
    }

    public void verifyBtn() {
        Button verifyBtn = findViewById(R.id.verify_btn);
        verifyBtn.setOnClickListener(view -> {
            CheckBox firstCheckBox = findViewById(R.id.first_cb);
            CheckBox secondCheckBox = findViewById(R.id.second_cb);
            CheckBox thirdCheckBox = findViewById(R.id.third_cb);
            CheckBox fourthCheckBox = findViewById(R.id.fourth_cb);
            CheckBox fifthCheckBox = findViewById(R.id.fifth_cb);
            CheckBox sixthCheckBox = findViewById(R.id.sixth_cb);
            if(firstCheckBox.isChecked() && fourthCheckBox.isChecked() && fifthCheckBox.isChecked() && secondCheckBox.isChecked() == false && thirdCheckBox.isChecked() == false && sixthCheckBox.isChecked() == false) {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}