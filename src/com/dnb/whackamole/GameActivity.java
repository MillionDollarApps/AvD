package com.dnb.whackamole;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class GameActivity extends Activity {

    private ImageView bg1;
    private ImageView bg2;
    private ImageView bg3;
    private ImageView bg4;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        bg1 = (ImageView) findViewById(R.id.bg1);
        bg2 = (ImageView) findViewById(R.id.bg2);
        bg3 = (ImageView) findViewById(R.id.bg3);
        bg4 = (ImageView) findViewById(R.id.bg4);
    }
}
