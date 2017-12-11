package com.mobileapp.grady.finalmytube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.*;
//import android.view.*;
//import android.app.Activity;
import android.view.View;
import android.widget.*;
import android.database.*;//for cursor
import java.io.*;

public class MainActivity extends AppCompatActivity {
    TextView tvTitle1, tvTitle2, tvTitle3, tvDetail1, tvDetail2, tvDetail3;
    Button btnPlay1, btnPlay2, btnPlay3;
    String url1 = "";
    String url2 = "";
    String url3 = "";
    DBAdapter db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle1 = (TextView)findViewById(R.id.tvName1);
//        tvTitle2 = (TextView)findViewById(R.id.tvName2);
//        tvTitle3 = (TextView)findViewById(R.id.tvName3);
        tvDetail1 = (TextView)findViewById(R.id.tvDetail1);
//        tvDetail2 = (TextView)findViewById(R.id.tvDetail2);
//        tvDetail3 = (TextView)findViewById(R.id.tvDetail3);
        btnPlay1 = (Button)findViewById(R.id.btnWatchTrailerOne);
//        btnPlay2 = (Button)findViewById(R.id.btnWatchTrailer2);
//        btnPlay3 = (Button)findViewById(R.id.btnWatchTrailer3);



        try{
            String destPath = "/data/data/" + getPackageName() +"/database/video";
            //Alternate way to do destPath:
//            String destPath = Environment.getExternalStorageDirectory().getPath() +
//            getPackageName() + "/database/video";
            File f = new File(destPath);
            if(!f.exists()){
                CopyDB(getBaseContext().getAssets().open("video"),
                        new FileOutputStream(destPath));
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        db = new DBAdapter(this.getApplicationContext());

        //add a video- CREATE
        db.open();
        long id1 = db.insertContact("Pacific Rim","Giant robots fighting giant monsters", "5guMumPFBag");

        long id2 = db.insertContact("Black Panther","Its a super hero not a cat", "vt9UZo32KMk");

        long id3 = db.insertContact("DeadPool","He kills stuff", "vt9UZo32KMk");


//        db.close();

        btnPlay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(MainActivity.this, TrailerDetailActivity.class);
                //add the id of the video to pass through to the next activity
                video.putExtra("url", url1);
                video.putExtra("title", tvTitle1.getText().toString());
                video.putExtra("detail", tvDetail1.getText().toString());
                startActivity(video);
            }
        });

//        btnPlay2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent video = new Intent(MainActivity.this, TrailerDetailActivity.class);
//                //add the id of the video to pass through to the next activity
//                video.putExtra("url", url2);
//                startActivity(video);
//            }
//        });
//
//        btnPlay3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent video = new Intent(MainActivity.this, TrailerDetailActivity.class);
//                //add the id of the video to pass through to the next activity
//                video.putExtra("url", url3);
//                startActivity(video);
//            }
//        });

        Cursor c = db.getVideo(1);
        if(c.moveToFirst())
        {
            url1 = c.getString(3);
            tvTitle1.setText(c.getString(1));
            tvDetail1.setText(c.getString(2));
        }
        db.close();

//        db.open();
//        Cursor d = db.getVideo(2);
//        if(d.moveToFirst())
//        {
//            url2 = d.getString(3);
//            tvTitle2.setText(d.getString(1));
//            tvDetail2.setText(d.getString(2));
//        }
//        db.close();
//
//        db.open();
//        Cursor e = db.getVideo(3);
//        if(e.moveToFirst())
//        {
//            url3 = e.getString(3);
//            tvTitle3.setText(e.getString(1));
//            tvDetail3.setText(e.getString(2));
//        }
//
//        db.close();

    }

    public void CopyDB(InputStream inputStream,OutputStream outputStream)
            throws IOException{
        //copy 1k bytes at a time
        byte[] buffer = new byte[1024];
        int length;
        while((length = inputStream.read(buffer)) > 0)
        {
            outputStream.write(buffer,0,length);
        }
        inputStream.close();
        outputStream.close();
    }//end method CopyDB
}//end class

