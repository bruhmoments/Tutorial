package com.example.ananta.aplikasidatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bayup on 05-Dec-19.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String TABLE_NAME = "tbl_student";
    public static final String _ID = "_id";
    public static final String KELAS = "kelas";
    public static final String NAMA = "nama";
    static final String DB_NAME = "CBD.DB";
    static final int DB_VERSION = 1;
    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + _ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KELAS + " TEXT NOT NULL, " + NAMA + " TEXT);";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
