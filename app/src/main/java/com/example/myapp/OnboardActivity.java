package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OnboardActivity extends AppCompatActivity {
    ImageView img,imgv;
    TextView txtv;
    ImageButton btn,btnBack,btnNext;
    int c=1;
    int[] p = new int[]{R.drawable.page1,R.drawable.page2,R.drawable.page3};
    int[] f = new int[]{R.drawable.ic_image_hotoyou1,R.drawable.ic_image_hotoyou2,R.drawable.ic_image_hotoyou3};
    String[] a = new String[]{"Đảm bảo rằng điện thoại và TV (hoặc bộ điều hợp không dây) của bạn được kết nối với cùng một WIFI và tắt VPN.","Bật chức năng “Hiển thị Miracast” trên TV của bạn. (Bạn cần bật theo cách thủ công trên một số thiết bị, vào phần cài đặt hệ thống để kiểm tra).","Nhấp vào nút “Kết nối”, bật chức năng hiển thị không dây trên điện thoại của bạn và chờ để tìm kiếm thiết bị."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        img = findViewById(R.id.imgvIS);
        imgv = findViewById(R.id.imgvPage);
        txtv = findViewById(R.id.txtIS);
        btn = findViewById(R.id.btnCorrect);
        btnNext = findViewById(R.id.btnNext);
        btnBack = findViewById(R.id.btnBack);
        img.setImageResource(f[0]);
        imgv.setImageResource(p[0]);
        txtv.setText(a[0]);
        btnNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c<3){
                    img.setImageResource(f[c]);
                    imgv.setImageResource(p[c]);
                    txtv.setText(a[c]);
                    c++;
                }
            }
        });
        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c>0){
                    c--;
                    img.setImageResource(f[c]);
                    imgv.setImageResource(p[c]);
                    txtv.setText(a[c]);
                }
            }
        });
    }
    public void backly(View v)
    {
        Intent intent = new Intent(OnboardActivity.this, com.example.myapp.SettingActivity.class);
        startActivity(intent);
        finish();

    }
    public void correct(View view) {
        Intent intent = new Intent(OnboardActivity.this, com.example.myapp.DeviceActivity.class);
        startActivity(intent);
    }
}
