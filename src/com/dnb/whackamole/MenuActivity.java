package com.dnb.whackamole;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

/** Main Menu Activity class **/
public class MenuActivity extends Activity {

    private Button playButton;
    private Button settingsButton;
    private Button ranksButton;
    private Button helpButton;
    private Button facebookLinkButton;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        playButton = (Button) findViewById(R.id.playButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        ranksButton = (Button) findViewById(R.id.ranksButton);
        helpButton = (Button) findViewById(R.id.helpButton);
        facebookLinkButton = (Button) findViewById(R.id.facebookLinkButton);

        MenuButtonListener playButtonListener = new MenuButtonListener(MenuActivity.this, GameActivity.class);
        MenuButtonListener settingsButtonListener = new MenuButtonListener(MenuActivity.this, SettingsActivity.class);
        MenuButtonListener ranksButtonListener = new MenuButtonListener(MenuActivity.this, RanksActivity.class);
        MenuButtonListener helpButtonListener = new MenuButtonListener(MenuActivity.this, HelpActivity.class);
        LinkButtonListener facebookLinkButtonListener = new LinkButtonListener(getString(R.string.link_url));

        playButton.setOnClickListener(playButtonListener);
        settingsButton.setOnClickListener(settingsButtonListener);
        ranksButton.setOnClickListener(ranksButtonListener);
        helpButton.setOnClickListener(helpButtonListener);
        facebookLinkButton.setOnClickListener(facebookLinkButtonListener);

    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
