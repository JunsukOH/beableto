package com.android.beableto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CustomerActivity extends AppCompatActivity
{
    ImageButton customer_cancel;
    Button customer_inquiry;
    Button customer_check;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        customer_cancel = (ImageButton) findViewById(R.id.btn_customer_cancel);
        customer_inquiry = (Button) findViewById(R.id.btn_customer_inquiry);
        customer_check = (Button) findViewById(R.id.btn_customer_check);
        
        customer_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        customer_inquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerActivity.this, CustomerInquiryActivity.class);
                startActivity(intent);
            }
        });
        customer_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerActivity.this, CustomerCheckActivity.class);
                startActivity(intent);
            }
        });
    }
}
