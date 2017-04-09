package com.lucky.pot.potlucky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSelect(View view)
    {
        switch(view.getId())
        {
            case R.id.main:
                Intent i = new Intent(this, Profile.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                break;
        }
    }
}
