package com.android.beableto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CustomerCheckActivity extends AppCompatActivity
{
    private ListView m_oListView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_check);

        ImageButton customer_check_cancel = (ImageButton) findViewById(R.id.btn_customer_check_cancel);
        customer_check_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Data 생성.
        long now;
        Date mDate;
        String getTime;
        ArrayList<RequestInquiry> oData = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
        {
            RequestInquiry oItem = new RequestInquiry();
            now = System.currentTimeMillis();
            mDate = new Date(now);
            SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            getTime = simpleDate.format(mDate);
            oItem.strTitle = "데이터 " + (i + 1);
            oItem.strDate = getTime;
            oData.add(oItem);
        }

        // ListView 생성
        m_oListView = (ListView)findViewById(R.id.listView);
        ListAdapter oAdapter = new ListAdapter(oData);
        m_oListView.setAdapter(oAdapter);
    }
}
