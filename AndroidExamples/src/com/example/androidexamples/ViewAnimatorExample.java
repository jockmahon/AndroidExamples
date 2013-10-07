package com.example.androidexamples;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewAnimator;

public class ViewAnimatorExample extends Activity
{
	ViewAnimator va_tmp;
	
	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.view_animator_example );
	
		ImageView firstImage = new ImageView( this );
		firstImage.setImageResource( R.drawable.image1 );

		ImageView secondImage = new ImageView( this );
		secondImage.setImageResource( R.drawable.image2 );
		
		va_tmp = (ViewAnimator) findViewById( R.id.va_tmp );

		Animation in = AnimationUtils.loadAnimation( this, android.R.anim.slide_in_left );
		Animation out = AnimationUtils.loadAnimation( this, android.R.anim.slide_out_right );
		
		va_tmp.setInAnimation( in );
		va_tmp.setOutAnimation( out );
		
		va_tmp.addView( firstImage );
		va_tmp.addView( secondImage);
		
		
	}
	
	
	public void onButClick(View v)
	{
		va_tmp.showNext();
	}
}
