package com.personal.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private TextView welcomeText;
    private TextView userInfoText;
    private Button profileButton;
    private Button settingsButton;
    private Button logoutButton;
    private TextView dashboardResultText;

    private String userTC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // UI elemanlarını bağla
        welcomeText = findViewById(R.id.welcomeText);
        userInfoText = findViewById(R.id.userInfoText);
        profileButton = findViewById(R.id.profileButton);
        settingsButton = findViewById(R.id.settingsButton);
        logoutButton = findViewById(R.id.logoutButton);
        dashboardResultText = findViewById(R.id.dashboardResultText);

        // Login'den gelen TC bilgisini al
        Intent intent = getIntent();
        userTC = intent.getStringExtra("USER_TC");

        if (userTC != null && !userTC.isEmpty()) {
            userInfoText.setText("TC: " + userTC);
        }

        // Profil butonuna tıklanınca
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboardResultText.setText("Profil sayfası açılıyor...");
            }
        });

        // Ayarlar butonuna tıklanınca
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboardResultText.setText("Ayarlar sayfası açılıyor...");
            }
        });

        // Çıkış butonuna tıklanınca (ESKİ HALİ - GECİKME YOK)
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dashboardResultText.setText("Çıkış yapılıyor...");

                // Login ekranına geri dön
                Intent loginIntent = new Intent(DashboardActivity.this, MainActivity.class);
                loginIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(loginIntent);
                finish();
            }
        });
    }
}