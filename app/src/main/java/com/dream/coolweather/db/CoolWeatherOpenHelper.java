package com.dream.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by asus on 2015/2/27.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /**
     * State表建表语句
     */
    public static final String CREATE_STATE = "create table State (" +
            "id integer primary key autoincrement," +
            "state_name text," +
            "state_code text)";

    /**
     * Province表建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province (" +
            "id integer primary key autoincrement," +
            "province_name text," +
            "province_code text," +
            "state_code text)";
    /**
     * City表建表语句
     */
    public static final String CREATE_CITY = "create table City (" +
            "id integer primary key autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_code text)";
    /**
     * County表建表语句
     */
    public static final String CREATE_COUNTY = "create table County (" +
            "id integer primary key autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_code text)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_STATE);
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
