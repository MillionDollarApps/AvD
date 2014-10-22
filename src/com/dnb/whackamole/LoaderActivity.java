package com.dnb.whackamole;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoaderActivity extends Activity {

    private final int LOADER_UP_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_loader);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent loaderToMenu = new Intent(LoaderActivity.this, MenuActivity.class);
                startActivity(loaderToMenu);
                finish();
            }

        }, LOADER_UP_TIME);

    }

}
