package com.lucky.pot.potlucky;

import android.content.Intent;
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
                Intent i = new Intent(this, PartyCreator.class);
                startActivity(i);
                overridePendingTransition(0, 0);
                break;
            case R.id.hostParty:
                //Intent j = new Intent(this, )
            case R.id.invitations:
                //Intent k = new Intent(this, )
        }
    }
}
