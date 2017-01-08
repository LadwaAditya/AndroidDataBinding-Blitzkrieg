package com.ladwa.aditya.databinding_blitzkrieg;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Aditya on 08-Jan-17.
 */

public class Presenter {
    private Context context;

    public Presenter(Context context) {
        this.context = context;
    }

    public void onClickMethod(View view) {
        Toast.makeText(this.context, "Clicked Method reference button", Toast.LENGTH_SHORT).show();
    }

    public void onClickReference(User user) {
        Log.d("Onclick", "Clicked");
        Toast.makeText(this.context, "Clicked Listener method " + user.getFirstName() + user.getLastName(), Toast.LENGTH_SHORT).show();
    }
}
