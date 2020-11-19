package com.e.navigation_menu;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class MenuActivity1 extends AppCompatActivity implements View.OnClickListener {
    Button button_back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        button_back1=findViewById(R.id.button_back1);
        button_back1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent menu1=new Intent(MenuActivity1.this,MainActivity.class);
        startActivity(menu1);

    }
}