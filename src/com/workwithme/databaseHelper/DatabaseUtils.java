package com.workwithme.databaseHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.workwithme.userDataUtils.UserInfo;
import android.os.Environment;
import java.io.OutputStream;

/**
 * Created by Chen Zhuo on 3/18/2015.
 */
public class DatabaseUtils extends SQLiteOpenHelper{

  public static String LOG_TAG = "DatabaseUtils";
  
  public static int DATABASE_VERSION = 1;
  
  public static final String DATABASE_NAME = "WorkWithMe";
  public static final String TABLE_NAME = "" ;
  public static final String _Id = "ID";
  public static final String USERNAME = "username";
  public static final String PASSWORD = "password";
  public static final String USER_LOCATION = "location";
  public static final String USER_EMAIL = "email";
  public static final String USER_GENDER = "gender";
  public static final String TYPE_INTEGER = "INTEGER";
  public static final String TYPE_TEXT = "TEXT";
  public static final String TYPE_BOOL = "BOOL";
  
  public static final String CREATE_TABLE  = "CREATE TABLE" + TABLE_NAME +
      "(" + _Id + TYPE_INTEGER + "," +
            USERNAME + TYPE_TEXT + "," +
            PASSWORD + TYPE_TEXT + "," +
            USER_EMAIL + TYPE_TEXT + "," +
            USER_GENDER + TYPE_BOOL + "," +
            USER_LOCATION + TYPE_TEXT +
      ")";
  
  public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TABLE_NAME;
  
  
  public DatabaseUtils(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
    super(context, DATABASE_NAME, factory, DATABASE_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_TABLE);
    Log.d(LOG_TAG,"create the user table in database.");
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(SQL_DELETE_ENTRIES);
    onCreate(db);
  }
  
  public long addUser(UserInfo user){
    if(user == null)
      return -1;
   
   
    SQLiteDatabase db = this.getWritableDatabase();
    ContentValues values = new ContentValues();
    values.put(USER_EMAIL,user.getUserEmail());
    values.put(USERNAME,user.getUserName());
    values.put(PASSWORD,user.getUserPassport());
    values.put(_Id,user.getUserId());
    values.put(USER_LOCATION,user.getUserLocation());

    //String dirName = Environment.getExternalStorageDirectory().toString();
    //OutputStream os = null;

    long rowid = db.insert( TABLE_NAME, null, values);
    Log.d(LOG_TAG, "An user has been added to the database" + user.getUserName());

    return rowid;
  }
}
