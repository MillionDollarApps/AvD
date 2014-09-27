package com.dnb.whackamole;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Creates button listener using the class constructor that accesses the link passed on by a String.
 * <P>
 * <b> Parameters</b> <br>
 * <b> String = getString(R.string.urlResource);
 **/
public class LinkButtonListener implements OnClickListener {

    private final String linkURL;

    public LinkButtonListener(final String link) {
        linkURL = link;
    }

    /**
     * Opens an URL.
     * 
     * @see OnClickListener#onClick(View)
     */
    @Override
    public void onClick(final View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkURL));
        v.getContext().startActivity(intent);
    }
}
