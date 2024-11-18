package com.example.num_5;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAbout = findViewById(R.id.btn_about);
        Button btnContacts = findViewById(R.id.btn_contacts);

        btnAbout.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
            showToast("Переход на экран 'О приложении' выполнен");
        });

        btnContacts.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ContactsActivity.class));
            showToast("Переход на экран 'Контакты' выполнен");
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}