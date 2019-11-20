package com.android.beableto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.beableto.RequestInquiry;

public class CustomerInquiryActivity extends AppCompatActivity
{
    ImageButton customer_inquiry_cancel;
    Button customer_inquiry_next;
    EditText customer_inquiry_title;
    EditText customer_inquiry_content;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_inquiry);

        customer_inquiry_cancel = (ImageButton) findViewById(R.id.btn_customer_inquiry_cancel);
        customer_inquiry_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        customer_inquiry_next = (Button) findViewById(R.id.btn_customer_inquiry_next);
        customer_inquiry_title = (EditText) findViewById(R.id.text_customer_inquiry_title);
        customer_inquiry_content = (EditText) findViewById(R.id.text_customer_inquiry_content);
        customer_inquiry_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(customer_inquiry_title.getText().toString().length() > 0)
                {
                    if(customer_inquiry_content.getText().toString().length() > 0)
                    {
                        Intent intent = new Intent(CustomerInquiryActivity.this, CustomerActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(CustomerInquiryActivity.this, "내용을 입력해주세요.", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(CustomerInquiryActivity.this, "제목을 입력해주세요.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
