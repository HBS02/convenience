package com.example.shin.convenience;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View view)
    {
        Intent intent1 = new Intent(this, Bus.class);
        startActivity(intent1);
    }

    public void click2(View view)
    {
        Intent intent = new Intent(this, Food.class);
        startActivity(intent);
    }

    public void click3(View view)
    {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    public void click4(View view)
    {
        Intent intent = new Intent(this, List.class);
        startActivity(intent);
    }
    public void click5(View view)
    {
        Intent intent = new Intent(this, SignupPage.class);
        startActivity(intent);
    }

    public void click6(View view)
    {
        Intent intent = new Intent(this, My.class);
        startActivity(intent);
    }


}
