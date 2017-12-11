package com.mobileapp.grady.finalmytube;

import android.content.*;
import android.database.*;
import android.database.sqlite.*;
import android.util.Log;

public class DBAdapter
{
    public static final String KEY_ROWID = "_id";
    public static final String KEY_TITLE = "title";
    public static final String KEY_DESCRIPTION ="description";
    public static final String KEY_URL ="path";


    public static final String TAG = "DBAdapter";

    private static final String DATABASE_NAME = "video";
    private static final String DATABASE_TABLE = "videos";
    private static final int DATABASE_VERSION = 2;

    private static final String DATABASE_CREATE =
            "create table " + DATABASE_TABLE + " (_id integer primary key autoincrement, "
                    + "title text not null, description text not null, path text not null)";

    private final Context context;
    private DatabaseHelper DBHelper;
    private SQLiteDatabase db;

    public DBAdapter(Context ctx)
    {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }

    private static class DatabaseHelper extends SQLiteOpenHelper
    {
        DatabaseHelper(Context context)
        {
            super(context,DATABASE_NAME,null,3);
        }

        public void onCreate(SQLiteDatabase db)
        {
            try{
                db.execSQL(DATABASE_CREATE);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }//end method onCreate

        public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
        {
            Log.w(TAG,"Upgrade database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS contacts");
            onCreate(db);
        }//end method onUpgrade
    }

    //open the database
    public DBAdapter open() throws SQLException
    {
        db = DBHelper.getWritableDatabase();
        return this;
    }

    //close the database
    public void close()
    {
        DBHelper.close();
    }

    //insert a contact into the database
    public long insertContact(String name,String detail, String link)
    {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_TITLE, name);
        initialValues.put(KEY_DESCRIPTION, detail);
        initialValues.put(KEY_URL, link);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }

    //delete a particular contact
    public boolean deleteContact(long rowId)
    {
        return db.delete(DATABASE_TABLE,KEY_ROWID + "=" + rowId,null) >0;
    }

    //retrieve all the contacts
    public Cursor getAllVideos()
    {
        return db.query(DATABASE_TABLE,new String[]{KEY_ROWID,KEY_TITLE,
                KEY_DESCRIPTION,KEY_URL},null,null,null,null,null);
    }

    //retrieve a single contact
    public Cursor getVideo(long rowId) throws SQLException
    {
        Cursor mCursor = db.query(true, DATABASE_TABLE, new String[] {KEY_ROWID,
                KEY_TITLE,KEY_DESCRIPTION, KEY_URL},KEY_ROWID + "=" + rowId,null,null,null,null,null);
        if(mCursor != null)
        {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    //updates a contact
//    public boolean updateContact(long rowId,String name,String email)
//    {
//        ContentValues cval = new ContentValues();
//        cval.put(KEY_NAME, name);
//        cval.put(KEY_EMAIL, email);
//        return db.update(DATABASE_TABLE, cval, KEY_ROWID + "=" + rowId,null) >0;
//    }

}//end class DBAdapter



//import android.content.*;
//import android.database.*;
//import android.database.sqlite.*;
//import android.util.Log;
//
//public class DBAdapter extends SQLiteOpenHelper{
//    public static final String DATABASE_NAME = "video";
//    public static final String TABLE_NAME = "videos";
//    public static final String COL_1 = "id";
//    public static final String COL_2 = "name";
//    public static final String COL_3 = "details";
//    public static final String COL_4 = "link";
//
//    public DBAdapter(Context context) {
//        super(context, DATABASE_NAME, null, 1);
//
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("create table " + TABLE_NAME + " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                "name TEXT, details TEXT, link TEXT);");
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(db);
//    }
//
//    public boolean insertData(String name, String details, String link)
//    {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(COL_2, name);
//        contentValues.put(COL_3, details);
//        contentValues.put(COL_4, link);
//
//        long result = db.insert(TABLE_NAME, null, contentValues);
//        if(result == -1)
//        {
//            return false;
//        }
//        else
//        {
//            return true;
//        }
//
//    }
//}//end class DBAdapter