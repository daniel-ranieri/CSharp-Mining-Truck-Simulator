//Daniel Ranieri
//131600214
//21/09/2016

//This is a program that will tell you what your life balance is
//It has a slide bar that will change the images, show you how your scale
//looks and an image of your current situation.

package com.daniel.lifebalance;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

	//Initialising the texts and images and seek bar names.
	private String[] text;
	private TextView words;
	private SeekBar seek;
	private ImageView imageViewPic, imageScale;

	//on opening the program will run the enable seekbar method.
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		enableSeekbar();
	}

	//This is the switch method that changes the images depending on where the slider
	//is along the bar. It creates the image views and texts and uses the slidebar position
	//to determine what to change each picture to in the slide bar.
	public void switchMethod(int seeker) {
		text = getResources().getStringArray(R.array.texts);
		imageViewPic  = (ImageView) findViewById(R.id.imageView1);
		imageScale = (ImageView) findViewById(R.id.imageViewScale);
		words = (TextView) findViewById(R.id.quotes); 
		words.setText(text[seeker]);

		switch (seeker) {
		case 0:
			imageViewPic.setImageResource(R.drawable.zero);
			imageScale.setImageResource(R.drawable.scales0);
			break;
		case 1:
			imageViewPic.setImageResource(R.drawable.one);
			imageScale.setImageResource(R.drawable.scales1);
			break;
		case 2:
			imageViewPic.setImageResource(R.drawable.two);
			imageScale.setImageResource(R.drawable.scales2);
			break;
		case 3:
			imageViewPic.setImageResource(R.drawable.three);
			imageScale.setImageResource(R.drawable.scales3);
			break;
		case 4:
			imageViewPic.setImageResource(R.drawable.four);
			imageScale.setImageResource(R.drawable.scales4);
			break;
		case 5:
			imageViewPic.setImageResource(R.drawable.five);
			imageScale.setImageResource(R.drawable.scales5);
			break;
		case 6:
			imageViewPic.setImageResource(R.drawable.six);
			imageScale.setImageResource(R.drawable.scales6);
			break;
		}
	}

	//Enable seekbar, set the settings and create a listener that will use the switch method
	//when the bar is changed by the user. The on progress changed will use the seekbar progress.
	public void enableSeekbar() {
		seek = (SeekBar) findViewById(R.id.seekBar1);
		seek.setProgress(3);
		seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onStartTrackingTouch(SeekBar arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				switchMethod(arg0.getProgress());
			}
		});
	}
}