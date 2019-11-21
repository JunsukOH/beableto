package com.android.beableto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class MypagePasswordActivity1 extends AppCompatActivity
{
    ImageButton mypage_password1_cancel;
    Button mypage_password1_finish;
    EditText mypage_password1_id;
    EditText mypage_password1_pw;

    private ListView m_oListView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_password1);

        mypage_password1_cancel = (ImageButton) findViewById(R.id.btn_mypage_password1_cancel);
        mypage_password1_finish = (Button) findViewById(R.id.btn_mypage_password1_finish);
        mypage_password1_id = (EditText) findViewById(R.id.text_mypage_password1_id);
        mypage_password1_pw = (EditText) findViewById(R.id.text_mypage_password1_pw);

        mypage_password1_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mypage_password1_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mypage_password1_id.getText().toString().equals("junsuk0522@cau.ac.kr"))
                {
                    if(mypage_password1_pw.getText().toString().equals("junsuk0522"))
                    {
                        Intent intent = new Intent(MypagePasswordActivity1.this, MypagePasswordActivity2.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MypagePasswordActivity1.this, "아이디 또는 비밀번호가 일치하지 않습니다.", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(MypagePasswordActivity1.this, "아이디 또는 비밀번호가 일치하지 않습니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
