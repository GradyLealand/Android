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
    TextView tvTitle, tvDetail;
    Button btnPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle = (TextView)findViewById(R.id.tvMainMoiveName);
        tvDetail = (TextView)findViewById(R.id.tvMainMovieDetail);
        btnPlay = (Button)findViewById(R.id.btnWatchTrailer);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(MainActivity.this, TrailerDetailActivity.class);
                startActivity(video);
            }
        });
//        try{
////            String destPath = "/data/data/" + getPackageName() +"/database/MyDB";
//            //Alternate way to do destPath:
//            String destPath = Environment.getExternalStorageDirectory().getPath() +
//            getPackageName() + "/database/video";
//            File f = new File(destPath);
//            if(!f.exists()){
//                CopyDB(getBaseContext().getAssets().open("video"),
//                        new FileOutputStream(destPath));
//            }
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        DBAdapter db = new DBAdapter(this);
//
//        //add a video- CREATE
//        db.open();
//        long id = db.insertContact("Pacific Rim","Giant robots fighting giant monsters", "5guMumPFBag");
//        db.close();
//
//        Cursor c = db.getVideo(1);
//        if(c.moveToFirst())
//        {
//            tvTitle.setText(c.getString(1));
//            tvDetail.setText(c.getString(2));
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

