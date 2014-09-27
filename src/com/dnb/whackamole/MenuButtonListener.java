package com.dnb.whackamole;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Creates button listener using the class constructor that passes intent from context to chosen Activity.
 * <P>
 * <b> Parameters</b> (context, chosenActivity.class) <br>
 * <b> context = current context(Activity.this); <br>
 * <b> chosenActivity = the activity you want to pass intent to(Activity.class);
 **/
public class MenuButtonListener implements OnClickListener {

    private final Class<?> Activity;
    private final MenuActivity menuActivity;

    public MenuButtonListener(final MenuActivity menuActivity, final Class<?> Activity) {
        this.Activity = Activity;
        this.menuActivity = menuActivity;
    }

    @Override
    public void onClick(final View v) {
        Intent intent = new Intent(menuActivity, Activity);
        v.getContext().startActivity(intent);
    }

}
