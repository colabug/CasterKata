package com.greenlifesoftware.robolectricpractice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends Activity
{
    public static Intent newIntent( Context context )
    {
        return new Intent( context, SecondActivity.class );
    }

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );
    }
}
