package com.sunbeaminfo.admin.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sunbeaminfo.admin.dbhelper.MobiledbHelper;

public class MobileProvider extends ContentProvider{

    private static final String AUTHORITY="com.sunbeaminfo.admin.provider.MobileProvider";
    private static UriMatcher uriMatcher= new UriMatcher(UriMatcher.NO_MATCH);  //-1

    static{
        uriMatcher.addURI(AUTHORITY,"/mobiles",0);
    }
    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        switch (uriMatcher.match(uri))
        {
            case 0:
                return new MobiledbHelper(getContext()).getMobile();

        }
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
