package com.example.userinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.CameraPosition;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView; // 네이버 지도 객체
    private static NaverMap naverMap;
    private LatLng myLatLng = new LatLng(37.3399, 126.733);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        mapView = (MapView) findViewById(R.id.mapView);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap){
        this.naverMap = naverMap;

        CameraPosition cameraPosition = new CameraPosition(myLatLng, 16);
        naverMap.setCameraPosition(cameraPosition);
    }
}