package com.example.androidexamples;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;



public class ChronometerExample extends Activity
{
	Chronometer chronTimer;
	Button btnStart;
	Button btnStop;


	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		
		setContentView( R.layout.chronometer_example );

		chronTimer = (Chronometer) findViewById( R.id.chron_timer );
		btnStart = (Button) findViewById( R.id.btn_start );
		btnStop  = (Button) findViewById( R.id.btn_stop );
	}


	public void onStartClick( View v)
	{
		chronTimer.start();
		
	}


	public void onStopClick( View v)
	{
		
		chronTimer.stop();
		
	}
}
