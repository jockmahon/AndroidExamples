package com.example.androidexamples;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.Button;

public class WakeLockExample extends Activity
{

	
	Button btnStart;
	Button btnStop;
	PowerManager.WakeLock mLock;

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.wake_lock_example );
		
	}
	


	public void onStartClick( View v)
	{
		PowerManager pm = (PowerManager) getSystemService( Context.POWER_SERVICE );
		mLock = pm.newWakeLock( PowerManager.SCREEN_DIM_WAKE_LOCK | PowerManager.ON_AFTER_RELEASE, "MOOSE");
		mLock.acquire();
	}


	public void onStopClick( View v)
	{
		mLock.release();
		
	}

}
