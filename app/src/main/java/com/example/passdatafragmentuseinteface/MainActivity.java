package com.example.passdatafragmentuseinteface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements sendData {

    TextView tvDisplayMain;
    FragmentBelow fragmentBelow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDisplayMain = findViewById(R.id.tvDisplayMain);

        fragmentBelow = (FragmentBelow) getSupportFragmentManager()
                .findFragmentById(R.id.frmBelow);

    }

    @Override
    public void send(String a) {
        tvDisplayMain.setText(a);
        fragmentBelow.UpdateData(a);

    }
}