package com.example.androidexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class TextSwitcherExample extends Activity
{
	TextSwitcher txtSwit;
	Button but;
	TextView myTxt;
	Boolean isFirst = true;


	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.text_switcher_example );

		txtSwit = (TextSwitcher) findViewById( R.id.txtSwit );
		but = (Button) findViewById( R.id.but );

		TextView tmp = new TextView( this );
		tmp.setTextSize( 20 );
		tmp.setLayoutParams( new LayoutParams( LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT ) );
		tmp.setText( "First Text" );

		TextView tmp2 = new TextView( this );
		tmp2.setTextSize( 20 );
		tmp2.setLayoutParams( new LayoutParams( LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT ) );
		tmp2.setText( "Second Text" );

		Animation in = AnimationUtils.loadAnimation( this, android.R.anim.slide_in_left );
		Animation out = AnimationUtils.loadAnimation( this, android.R.anim.slide_out_right );

		txtSwit.setInAnimation( in );
		txtSwit.setOutAnimation( out );

		txtSwit.addView( tmp );
		txtSwit.addView( tmp2 );
	}


	public void onButClick( View v )
	{

		if( isFirst )
		{
			((TextView ) txtSwit.getCurrentView() ).setText( "asdasdasd" );
			//txtSwit.setText( "Second Text" );
		}
		else
		{
			txtSwit.setText( "First Text" );
		}
		isFirst = !isFirst;
	}


	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate( R.menu.text_switcher_example, menu );
		return true;
	}

}
