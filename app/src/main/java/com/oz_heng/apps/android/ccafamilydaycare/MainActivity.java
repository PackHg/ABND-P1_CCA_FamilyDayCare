package com.oz_heng.apps.android.ccafamilydaycare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String CCA_FDC_ON_GOOGLE_MAPS = "https://www.google.com.au/maps/place/2+Dickson+Ave,+West+Ryde+NSW+2114/@-33.8062937,151.086607,17z/data=!4m13!1m7!3m6!1s0x6b12a44e1f2ed9b3:0xad57bc445457c27!2s2+Dickson+Ave,+West+Ryde+NSW+2114!3b1!8m2!3d-33.8065383!4d151.0865966!3m4!1s0x6b12a44e1f2ed9b3:0xad57bc445457c27!8m2!3d-33.8065383!4d151.0865966";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Set setOnClickListener on address TextView to launch a Web browser on the
         * organisation location on Google Maps.
         */
        TextView address = (TextView) findViewById(R.id.org_address);
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage(CCA_FDC_ON_GOOGLE_MAPS);
            }
        });
    }

    /*
     * The following helper method is from
     * https://developer.android.com/guide/components/intents-common.html
     */

    /**
     * Open a Web browser at the url address.
     *
     * @param url a {@link String}
     */
    private void openWebPage(String url) {
        Uri webPage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}



