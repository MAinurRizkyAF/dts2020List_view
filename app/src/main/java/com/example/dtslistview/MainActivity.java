package com.example.dtslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvNegara;
    private String[] nmNegara = new String[]{
            "Indonesia","Malaysia","Singapore","Italia","Inggris","Belanda","Argentina","Chile",
        "Mesir","Uganda"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvNegara = (ListView) findViewById(R.id.listV);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                android.R.id.text1, nmNegara);
        lvNegara.setAdapter(adapter1);
        lvNegara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Memilih : "+nmNegara[position],Toast.LENGTH_LONG).show();
            }
        });

}}