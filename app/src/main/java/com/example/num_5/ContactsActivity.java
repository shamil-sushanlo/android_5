package com.example.num_5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        Button btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(v -> {
            startActivity(new Intent(ContactsActivity.this, MainActivity.class));
            showToast("Возврат на главный экран выполнен");
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}