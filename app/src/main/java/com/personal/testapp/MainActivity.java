package com.personal.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText tcField;
    private EditText passwordField;
    private Button loginButton;
    private CheckBox rememberMeCheckbox;
    private TextView forgotPasswordLink;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UI elemanlarını bağla
        tcField = findViewById(R.id.tcField);
        passwordField = findViewById(R.id.passwordField);
        loginButton = findViewById(R.id.loginButton);
        rememberMeCheckbox = findViewById(R.id.rememberMeCheckbox);
        forgotPasswordLink = findViewById(R.id.forgotPasswordLink);
        resultText = findViewById(R.id.resultText);

        // Login butonuna tıklanınca
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tc = tcField.getText().toString();
                String password = passwordField.getText().toString();

                // Boş alan kontrolü
                if (tc.isEmpty() || password.isEmpty()) {
                    resultText.setText("Lütfen tüm alanları doldurun!");
                    return;
                }

                // TC uzunluk kontrolü
                if (tc.length() != 11) {
                    resultText.setText("TC 11 haneli olmalıdır!");
                    return;
                }

                // Şifre uzunluk kontrolü
                if (password.length() != 6) {
                    resultText.setText("Şifre 6 haneli olmalıdır!");
                    return;
                }

                // ✨ ÇOKLU KULLANICI KONTROLÜ (4 kullanıcı)
                if ((tc.equals("12345678901") && password.equals("111111")) ||
                        (tc.equals("11111111111") && password.equals("111111")) ||
                        (tc.equals("22222222222") && password.equals("222222")) ||
                        (tc.equals("33333333333") && password.equals("333333"))) {

                    // Başarılı giriş
                    resultText.setText("Giriş Başarılı! Hoş geldiniz.");

                    // Beni hatırla kontrolü
                    if (rememberMeCheckbox.isChecked()) {
                        resultText.setText("Bilgileriniz kaydedildi. Giriş yapılıyor...");
                    }

                    // Dashboard'a geç
                    Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                    intent.putExtra("USER_TC", tc);
                    startActivity(intent);

                } else {
                    // Hatalı giriş
                    resultText.setText("TC veya şifre hatalı!");
                }
            }
        });

        // Şifremi unuttum linkine tıklanınca
        forgotPasswordLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText("Şifre sıfırlama e-postası gönderildi!");
            }
        });
    }
}