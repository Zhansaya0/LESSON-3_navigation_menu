package com.e.navigation_menu;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MenuActivity4 extends AppCompatActivity implements View.OnClickListener {
    Button button_back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
        button_back4=findViewById(R.id.button_back4);
        button_back4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent menu4=new Intent(MenuActivity4.this,MainActivity.class);
        startActivity(menu4);
    }
}