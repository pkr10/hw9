package com.example.rok.a0427;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    GridView g1;
    gridadapter adapter;
    ArrayList<fruid> data = new ArrayList<fruid>();
    CheckBox c1;
    Button b1;
    EditText e1;
    AutoCompleteTextView a1;
    ImageView i1;
    int count1;
    ArrayList<String> data1  = new ArrayList<String>();
    ArrayList<String> data2 = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        g1 = (GridView)findViewById(R.id.gridview);
        c1 = (CheckBox)findViewById(R.id.checkBox2);
        a1 = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        e1 =(EditText)findViewById(R.id.editText);
        b1 = (Button)findViewById(R.id.b_add);
        i1  = (ImageView)findViewById(R.id.image1);




        adapter = new gridadapter(data,this);

        g1.setAdapter(adapter);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c1.isChecked()){
                    for(int i =0;i<data.size();i++){
                        data.get(i).setCount(1);
                    }


                    adapter.notifyDataSetChanged();
                }
                else{
                    for(int i = 0;i<data.size();i++){
                        data.get(i).setCount(0);
                    }
                    adapter.notifyDataSetChanged();
                }
            }
        });
       g1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               a1.setText(data.get(position).name);
               e1.setText(data.get(position).price);
               i1.setImageResource(data.get(position).imgno);
               Toast.makeText(getApplicationContext(), data.get(position).name+"이 카트에 담겼습니다", Toast.LENGTH_SHORT).show();
               data2.add(data.get(position).name);
               b1.setText("M");
               count1 = position;


           }
       });
        



        addfruit Addfruit = (addfruit)findViewById(R.id.add);

            Addfruit.setOnSetListener(new addfruit.OnSetListener() {
                @Override
                public void onSet(String name, int imagno, String price) {
                    if(c1.isChecked()){
                        adapter.setFruit(count1, new fruid(name, imagno, price, 1));

                    }
                    else{
                        adapter.setFruit(count1, new fruid(name, imagno, price, 0));

                    }
                    adapter.notifyDataSetChanged();
                    b1.setText("ADD");

                }
            });
            Addfruit.setAddListener(new addfruit.OnAddListener() {
                @Override
                public void onAdd(String name, int imagno, String price) {
                    if(c1.isChecked()){
                        adapter.addFruit(new fruid(name, imagno, price, 1));
                    }
                    else{
                        adapter.addFruit(new fruid(name, imagno, price, 0));
                    }


                    adapter.notifyDataSetChanged();
                }


            });
        data1.add("아보카도");
        data1.add("수박");
        data1.add("바나나");
        data1.add("체리");
        data1.add("크랜베리");
        data1.add("포도");
        data1.add("오렌지");
        a1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,data1));
    }

    public void onmyclick(View view) {
        switch(view.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(), data2+"이 담겨있습니다",Toast.LENGTH_LONG).show();
        }
    }
}
