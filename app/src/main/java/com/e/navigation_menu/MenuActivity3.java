package com.e.navigation_menu;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MenuActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button button_back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        button_back3=findViewById(R.id.button_back3);
        button_back3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent menu3=new Intent(MenuActivity3.this,MainActivity.class);
        startActivity(menu3);
    }
}