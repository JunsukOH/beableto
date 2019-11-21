package com.android.beableto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MypageActivity extends AppCompatActivity
{
    ImageButton mypage_cancel;
    Button mypage_password_modify;
    Button mypage_information_modify;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        mypage_cancel = (ImageButton) findViewById(R.id.btn_mypage_cancel);
        mypage_password_modify = (Button) findViewById(R.id.btn_mypage_password_modify);
        mypage_information_modify = (Button) findViewById(R.id.btn_mypage_information_modify);

        mypage_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mypage_password_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MypageActivity.this, MypagePasswordActivity1.class);
                startActivity(intent);
            }
        });
        mypage_information_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MypageActivity.this, MypageInformationActivity.class);
                startActivity(intent);
            }
        });
    }
}
