package com.android.beableto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MypagePasswordActivity2 extends AppCompatActivity
{
    ImageButton mypage_password2_cancel;
    Button mypage_password2_finish;
    EditText mypage_password2_pw;
    EditText mypage_password2_pw_check;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_password2);

        mypage_password2_cancel = (ImageButton) findViewById(R.id.btn_mypage_password2_cancel);
        mypage_password2_finish = (Button) findViewById(R.id.btn_mypage_password2_finish);
        mypage_password2_pw = (EditText) findViewById(R.id.text_mypage_password2_pw);
        mypage_password2_pw_check = (EditText) findViewById(R.id.text_mypage_password2_pw_check);

        mypage_password2_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mypage_password2_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mypage_password2_pw.getText().toString().length() >= 8 && mypage_password2_pw.getText().toString().length() <= 16)
                {
                    if(mypage_password2_pw.getText().toString().equals(mypage_password2_pw_check.getText().toString()))
                    {
                        Intent intent = new Intent(MypagePasswordActivity2.this, MypageActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MypagePasswordActivity2.this, "새로운 비밀번호가 일치하지 않습니다.", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(MypagePasswordActivity2.this, "비밀번호 자릿수를 확인해주세요.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
