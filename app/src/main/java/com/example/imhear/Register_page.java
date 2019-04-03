package com.example.imhear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;

public class Register_page extends AppCompatActivity {

    private ArrayList <Countery_item> mCounterylist;
    private Countery_item_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        inList();

        Spinner spinner1 =  findViewById(R.id.spinner);
        adapter = new Countery_item_Adapter(this,mCounterylist);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Countery_item clickItem = (Countery_item) parent.getItemAtPosition(position);
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    private void inList(){
        mCounterylist = new ArrayList<>();
        mCounterylist.add(new Countery_item(R.drawable.iconarabia,"+966 "));
        mCounterylist.add(new Countery_item(R.drawable.iconindia,"+91 "));
        mCounterylist.add(new Countery_item(R.drawable.iconsudan,"+24 "));

    }
}
