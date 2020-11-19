package com.e.navigation_menu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button_menu1,button_menu2;
    Button button_menu3,button_menu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_menu1=findViewById(R.id.button_menu1);
        button_menu2=findViewById(R.id.button_menu2);
        button_menu3=findViewById(R.id.button_menu3);
        button_menu4=findViewById(R.id.button_menu4);

        button_menu1.setOnClickListener(this);
        button_menu2.setOnClickListener(this);
        button_menu3.setOnClickListener(this);
        button_menu4.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        if(view.getId()==R.id.button_menu1){
        Intent menu1=new Intent(MainActivity.this,MenuActivity1.class);
        startActivity(menu1);
        }
        else if(view.getId()==R.id.button_menu2){
        Intent menu2=new Intent(MainActivity.this,MenuActivity2.class);
        startActivity(menu2);
        }
        else if(view.getId()==R.id.button_menu3){
        Intent menu3=new Intent(MainActivity.this,MenuActivity3.class);
        startActivity(menu3);
        }
        else if(view.getId()==R.id.button_menu4){
        Intent menu4=new Intent(MainActivity.this,MenuActivity4.class);
        startActivity(menu4);
        }
    }

}
