package com.example.androidexamples;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CountDownTimerExample extends Activity
{
	TextView timer;
	Button startTimer;
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.count_down_timer_example );
		
		timer = (TextView) findViewById( R.id.timer );
		startTimer = (Button) findViewById( R.id.btn_start );
	}
	
	
	public void onStartClick( View v)
	{
		CountDownTimer count = new CountDownTimer(30000, 1000)
		{
			@Override
			public void onTick( long millisUntilFinished )
			{
				timer.setText( millisUntilFinished/ 1000 + " left" );
			}
			
			
			@Override
			public void onFinish()
			{
				timer.setText("Done");
			}
		}.start();
	}
}
