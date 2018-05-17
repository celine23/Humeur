package com.lin.celine.moodtracker.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by celine on 30/03/2018.
 */

public class SQLite extends SQLiteOpenHelper {

    private static final String mood_key= "mood_key";
    private static final String mood_comment = "comment";
    private static final String mood_date = "date";
    private static final String mood_mood = "mood";


        private static final String CREATE_TABLE = "CREATE TABLE " + mood_key +"("
            + mood_comment + " INTEGER COMMENT, " + mood_date + " DATE"
            + mood_mood + " MOOD)";

    public SQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("table mood " + mood_key + ";");
        onCreate(sqLiteDatabase);
    }
}
