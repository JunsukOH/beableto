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

public class MypageInformationActivity extends AppCompatActivity
{
    ImageButton mypage_information_cancel;
    Button mypage_information_finish;
    EditText mypage_information_name;
    EditText mypage_information_phone;
    EditText mypage_information_guardian_phone;

    private ListView m_oListView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_information);

        mypage_information_cancel = (ImageButton) findViewById(R.id.btn_mypage_information_cancel);
        mypage_information_finish = (Button) findViewById(R.id.btn_mypage_information_finish);
        mypage_information_name = (EditText) findViewById(R.id.text_mypage_information_name);
        mypage_information_phone = (EditText) findViewById(R.id.text_mypage_information_phone);
        mypage_information_guardian_phone = (EditText) findViewById(R.id.text_mypage_information_guardian_phone);

        mypage_information_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        mypage_information_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mypage_information_name.getText().toString().length() == 0 && mypage_information_phone.getText().toString().length() == 0 && mypage_information_guardian_phone.getText().toString().length() == 0)
                {
                    Toast.makeText(MypageInformationActivity.this, "수정사항이 존재하지 않습니다.", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent = new Intent(MypageInformationActivity.this, MypageActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
