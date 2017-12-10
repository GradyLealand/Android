package com.mobileapp.grady.mytube;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by Grady on 2017-12-09.
 *
 * code sourced from https://www.youtube.com/watch?v=fn5OlqQuOCk
 */

public class PopUp  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //assign the pop ups layout file
        setContentView(R.layout.add_popup);

        //get the dimensions of the phone screen
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        //set popups dimensions
        getWindow().setLayout((int)(width * .8), (int)(height * .6));
    }
}
