package com.example.bbygbbyg.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = ((EditText) findViewById(R.id.editQuestion)).getText().toString();
                String answer = ((EditText) findViewById(R.id.editAnswer).getText().toString());
                Intent data = new Intent();
                data.putExtra("question",question);
                data.putExtra("answer",answer);
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }
}
