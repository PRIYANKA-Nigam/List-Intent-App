package com.example.list_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView l;
String []sub={ "apple","Banana","guava","husk","mango","pine apple","strawberry"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disp();
    }
    public void disp(){
        l=(ListView)findViewById(R.id.lv);
        ArrayAdapter<String> a=new  ArrayAdapter<String>(this,R.layout.name,sub);
        l.setAdapter(a);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String ts=sub[i].toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("item",ts);
                startActivity(intent);

            }
        });


    }
}