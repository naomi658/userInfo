package com.example.userinfo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.naver.maps.map.NaverMap;

public class InfoActivity extends AppCompatActivity {
    Button startPoint, endPoint;
    Button timeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        startPoint = (Button) findViewById(R.id.startPoint);
        endPoint = (Button) findViewById(R.id.endPoint);
        timeButton = (Button) findViewById(R.id.timeButton);

        startPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });
    }
}