package com.e.navigation_menu;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MenuActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button button_back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        button_back2=findViewById(R.id.button_back2);
        button_back2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent menu2=new Intent(MenuActivity2.this,MainActivity.class);
        startActivity(menu2);
    }
}