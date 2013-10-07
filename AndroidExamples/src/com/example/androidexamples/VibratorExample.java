package com.example.androidexamples;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class VibratorExample extends Activity
{
	Button btnStart;
	Button btnStop;
	Vibrator vib;


	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.vibrator_example );

		vib = (Vibrator) getSystemService( VIBRATOR_SERVICE );

		btnStart = (Button) findViewById( R.id.btn_start );
		btnStop = (Button) findViewById( R.id.but_stop );

	}


	public void onStartClick( View v )
	{

		if( vib.hasVibrator() )
		{
			vib.vibrate( 3000 );
		}

	}


	public void onStopClick( View v )
	{
		vib.cancel();
	}

}
