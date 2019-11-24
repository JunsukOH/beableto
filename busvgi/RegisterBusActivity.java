package com.android.beableto_register_bus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RegisterBusActivity extends AppCompatActivity
{
    private Spinner bus_contents;
    ArrayList<String> arrayList_bus_contents;
    ArrayAdapter<String> arrayAdapter_bus_contents;
    private Spinner bus_location;
    ArrayList<String> arrayList_bus_location;
    ArrayAdapter<String> arrayAdapter_bus_location;
    EditText bus_number1;
    EditText bus_number2;
    CheckBox bus_push;
    Button bus_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_bus);

        arrayList_bus_contents = new ArrayList<>();
        arrayList_bus_contents.add("광역버스");
        arrayList_bus_contents.add("간선버스");
        arrayList_bus_contents.add("마을버스");
        arrayList_bus_contents.add("심야버스");
        arrayList_bus_contents.add("공항버스");
        arrayAdapter_bus_contents = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrayList_bus_contents);
        bus_contents = (Spinner)findViewById(R.id.spinner_bus_contents);
        bus_contents.setAdapter(arrayAdapter_bus_contents);
        arrayList_bus_location = new ArrayList<>();
        bus_number1 = (EditText) findViewById(R.id.text_bus_number1);
        bus_number2 = (EditText) findViewById(R.id.text_bus_number2);
        bus_push = (CheckBox) findViewById(R.id.cb_bus_push);
        bus_register = (Button) findViewById(R.id.btn_bus_register);

        bus_contents.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(bus_contents.getSelectedItem().toString().equals("광역버스"))
                {
                    arrayList_bus_location.clear();
                    arrayList_bus_location.add("서울특별시");
                    arrayList_bus_location.add("경기도");
                    arrayList_bus_location.add("부산광역시");
                    arrayList_bus_location.add("인천광역시");
                    arrayList_bus_location.add("대전광역시");
                    arrayList_bus_location.add("울산광역시");
                    arrayList_bus_location.add("경상남도 양산시");
                    arrayList_bus_location.add("경상남도 거제시");
                    arrayList_bus_location.add("충청남도 계룡시");
                    arrayList_bus_location.add("전라남도 나주시");
                    arrayList_bus_location.add("전라남도 담양군");
                    arrayList_bus_location.add("전라남도 여수시");
                    arrayList_bus_location.add("전라남도 순천시");
                    arrayList_bus_location.add("전라남도 광양시");
                    arrayAdapter_bus_location = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrayList_bus_location);
                    bus_location = (Spinner)findViewById(R.id.spinner_bus_location);
                    bus_location.setAdapter(arrayAdapter_bus_location);

                    bus_location.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            Toast.makeText(getApplicationContext(), arrayList_bus_location.get(i)+"(이)가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }
                else if(bus_contents.getSelectedItem().toString().equals("간선버스"))
                {
                    arrayList_bus_location.clear();
                    arrayList_bus_location.add("서울특별시");
                    arrayList_bus_location.add("경기도");
                    arrayList_bus_location.add("부산광역시");
                    arrayList_bus_location.add("대구광역시");
                    arrayList_bus_location.add("인천광역시");
                    arrayList_bus_location.add("광주광역시");
                    arrayList_bus_location.add("대전광역시");
                    arrayList_bus_location.add("충청북도 청주시");
                    arrayAdapter_bus_location = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrayList_bus_location);
                    bus_location = (Spinner)findViewById(R.id.spinner_bus_location);
                    bus_location.setAdapter(arrayAdapter_bus_location);

                    bus_location.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            Toast.makeText(getApplicationContext(), arrayList_bus_location.get(i)+"(이)가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }
                else if(bus_contents.getSelectedItem().toString().equals("마을버스"))
                {
                    arrayList_bus_location.clear();
                    arrayList_bus_location.add("종로구");
                    arrayList_bus_location.add("용산구");
                    arrayList_bus_location.add("성동구");
                    arrayList_bus_location.add("광진구");
                    arrayList_bus_location.add("동대문구");
                    arrayList_bus_location.add("중랑구");
                    arrayList_bus_location.add("성북구");
                    arrayList_bus_location.add("강북구");
                    arrayList_bus_location.add("도봉구");
                    arrayList_bus_location.add("노원구");
                    arrayList_bus_location.add("은평구");
                    arrayList_bus_location.add("서대문구");
                    arrayList_bus_location.add("마포구");
                    arrayList_bus_location.add("양천구");
                    arrayList_bus_location.add("강서구");
                    arrayList_bus_location.add("구로구");
                    arrayList_bus_location.add("금천구");
                    arrayList_bus_location.add("영등포구");
                    arrayList_bus_location.add("동작구");
                    arrayList_bus_location.add("관악구");
                    arrayList_bus_location.add("서초구");
                    arrayList_bus_location.add("강남구");
                    arrayList_bus_location.add("강동구");
                    arrayAdapter_bus_location = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrayList_bus_location);
                    bus_location = (Spinner)findViewById(R.id.spinner_bus_location);
                    bus_location.setAdapter(arrayAdapter_bus_location);

                    bus_location.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            Toast.makeText(getApplicationContext(), arrayList_bus_location.get(i)+"(이)가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                        }
                    });
                }
                else
                {
                    bus_location.clearAnimation();
                    arrayList_bus_location.clear();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


    }
}
