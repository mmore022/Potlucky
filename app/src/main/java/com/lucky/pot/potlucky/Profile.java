package com.lucky.pot.potlucky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Tia on 4/8/2017.
 */

public class Profile extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);
    }

    public void onSelect(View view)
    {
        switch(view.getId())
        {
            case R.id.startParty:
                //do
            case R.id.hostParty:
                //do
            case R.id.invitations:
                //do
        }
    }
}
