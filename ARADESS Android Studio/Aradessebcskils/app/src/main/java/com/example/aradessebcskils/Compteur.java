package com.example.aradessebcskils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Compteur extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "Electricité","Eau",
    };

    String[] subtitle ={
            "Sidi bozid","Sidi bozid",

    };

    Integer[] imgid={
            R.drawable.compteurelec,R.drawable.compteureau,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);

        Mylist adapter=new Mylist(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {

                    Intent intent = new Intent(Compteur.this, Detail.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}
