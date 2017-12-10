package com.mobileapp.grady.finalmytube;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Grady on 2017-12-09.
 *
 * code sourced from https://www.youtube.com/watch?v=fn5OlqQuOCk
 */

public class PopUp extends Activity {

    private EditText etAddName, etAddURL, etAddDetail;
    private Button btnAddDb;
    private DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        etAddName = findViewById(R.id.etAddName);
        etAddURL = findViewById(R.id.etAddURL);
        etAddDetail = findViewById(R.id.etAddDetail);
        btnAddDb = findViewById(R.id.btnAddURL);
        myDb = new DatabaseHelper(this);

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

        btnAddDb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }


    public void AddToDb()
    {
        boolean sucsses = myDb.insertData(etAddName.getText().toString(),
                etAddURL.getText().toString(), etAddDetail.getText().toString());

        if (sucsses)
        {
            Toast.makeText(PopUp.this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(PopUp.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
        }
    }
}
