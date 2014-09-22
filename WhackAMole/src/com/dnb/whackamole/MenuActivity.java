package com.dnb.whackamole;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MenuActivity extends Activity {


	private Button playButton;
	private Button settingsButton;
	private Button ranksButton;
	private Button helpButton;
	private Button linkButton;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        playButton = (Button) findViewById(R.id.playButton);
        settingsButton = (Button) findViewById(R.id.settingsButton);
        ranksButton = (Button) findViewById(R.id.ranksButton);
        helpButton = (Button) findViewById(R.id.helpButton);
        linkButton = (Button) findViewById(R.id.linkButton);
        
        playButton.setOnClickListener(playButtonListener);
        settingsButton.setOnClickListener(settingsButtonListener);
        ranksButton.setOnClickListener(ranksButtonListener);
        helpButton.setOnClickListener(helpButtonListener);
        linkButton.setOnClickListener(linkButtonListener);
    	
    }
    
    public OnClickListener playButtonListener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			
			Intent playIntent = new Intent(MenuActivity.this,GameActivity.class);
			startActivity(playIntent);
			
		}
    };
    
    public OnClickListener settingsButtonListener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			
			Intent intent = new Intent(MenuActivity.this,SettingsActivity.class);
			startActivity(intent);
			
		}
    };
    
    public OnClickListener ranksButtonListener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			
			Intent ranksIntent = new Intent(MenuActivity.this,RanksActivity.class);
			startActivity(ranksIntent);
			
		}
    };
    
    public OnClickListener helpButtonListener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			
			Intent helpIntent = new Intent(MenuActivity.this,HelpActivity.class);
			startActivity(helpIntent);
			
		}
    	
    };

    public OnClickListener linkButtonListener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String linkURL = getString(R.string.link_url);
			
			Intent linkIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(linkURL));
			
			startActivity(linkIntent);
		}
    	
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
