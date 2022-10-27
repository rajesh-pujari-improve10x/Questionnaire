
package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        radioButtonBtnToRadioButtonsChoiceActivity();
        checkBoxesBtnToCheckBoxesChoiceActivity();
    }

    public void radioButtonBtnToRadioButtonsChoiceActivity() {
        Button radioButtonBtn = findViewById(R.id.radio_buttons_btn);
        radioButtonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioButtonChoiceActivity.class);
            startActivity(intent);
        });
    }

    public void checkBoxesBtnToCheckBoxesChoiceActivity() {
        Button checkBoxesBtn = findViewById(R.id.check_boxes_btn);
        checkBoxesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckBoxesChoiceActivity.class);
            startActivity(intent);
        });
    }
}