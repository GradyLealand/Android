package com.mobileapp.grady.mytube;

import android.app.Activity;
import android.content.Intent;
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

public class PopUp  extends Activity {

    private EditText etAddToDb;
    private Button btnAddDb;
    private DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        etAddToDb = (EditText)findViewById(R.id.etAddURL);
        btnAddDb = (Button)findViewById(R.id.btnAddURL);
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

        AddToDb();
    }

    public void AddToDb()
    {
        btnAddDb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean sucsses = myDb.insertData(etAddToDb.getText().toString());

                if (sucsses)
                {
                    Toast.makeText(PopUp.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(PopUp.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
