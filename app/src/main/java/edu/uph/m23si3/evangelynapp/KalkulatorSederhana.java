package edu.uph.m23si3.evangelynapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorSederhana extends AppCompatActivity {
    public double tambahnilai(int angka1, int angka2) {
        return (angka1 + angka2);
    }

    public double kalinilai(int angka1, int angka2) {
        return (angka1 * angka2);
    }

    public double baginilai(int angka1, int angka2) {
        return (angka1 /angka2);
}

    EditText edtnilaipertama, edtnilaikedua;
    Button btntambah, btnkali, btnbagi;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_sederhana);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtnilaipertama = findViewById(R.id.edtnilaipertama);
        edtnilaikedua = findViewById(R.id.edtnilaikedua);
        btntambah = findViewById(R.id.btntambah);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        txthasil = findViewById(R.id.txthasil);

                btntambah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int angka1 = Integer.parseInt(edtnilaipertama.getText().toString());
                        int angka2 = Integer.parseInt(edtnilaikedua.getText().toString());

                        // hitung penjumlahan
                        double hasiljumlah = tambahnilai(angka1, angka2);

                        txthasil.setText(String.valueOf((int) hasiljumlah));
                    }
                    });

                btnkali.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int angka1 = Integer.parseInt(edtnilaipertama.getText().toString());
                        int angka2 = Integer.parseInt(edtnilaikedua.getText().toString());

                        // hitung perkalian
                        double hasilkali = kalinilai(angka1, angka2);

                        txthasil.setText(String.valueOf((int) hasilkali));
                    }
                });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int angka1 = Integer.parseInt((edtnilaipertama.getText().toString()));
                int angka2 = Integer.parseInt((edtnilaikedua.getText().toString()));

                // hitung pembagian
                double hasilbagi = baginilai(angka1, angka2);

                txthasil.setText(String.valueOf((int) hasilbagi));
            }
         });
        }
    }
