package com.example.kmj.listadd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Data> items = new ArrayList<>();
    ListViewAdapter mAdapter;
    EditText Ltext;
    EditText Stext;
    Button btn;
    ListView list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listivew);
        btn = findViewById(R.id.btn);
        Stext = findViewById(R.id.smallin);
        Ltext = findViewById(R.id.largein);

        mAdapter = new ListViewAdapter(items);
        list.setAdapter(mAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = Ltext.getText().toString();
                String text2 = Stext.getText().toString();
                items.add(new Data(text1, text2));
                mAdapter.notifyDataSetChanged();
                Ltext.setText("");
                Stext.setText("");

            }
        });


    }
}
