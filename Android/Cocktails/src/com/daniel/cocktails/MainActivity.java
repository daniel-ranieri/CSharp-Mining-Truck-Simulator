package com.daniel.cocktails;

//Daniel Ranieri 
//131600214
//24/08/2016

//An app that allows the user to select their first initial and their
//birth month and gives them a return of a drink name and image corresponding to
//their initial and month. You can then click the image and it will show a recipe.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends Activity {

	static String[] monthsoup;
	static String[] alphabetsoup;

	static String letterName = "Randy";
	static String monthName = "Frolic";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail_activity);

		
		final NumberPicker letter_picker = (NumberPicker) findViewById(R.id.initial_picker);
		final NumberPicker month_picker = (NumberPicker) findViewById(R.id.month_picker);

		alphabetsoup = getResources().getStringArray(R.array.alphabet);
		monthsoup = getResources().getStringArray(R.array.months);

		month_picker.setDisplayedValues(monthsoup);
		month_picker.setMinValue(0);
		month_picker.setMaxValue(11);

		letter_picker.setDisplayedValues(alphabetsoup);
		letter_picker.setMinValue(0);
		letter_picker.setMaxValue(25);

		// spinner wheel listeners to get the previous result or current spin.
		month_picker
				.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
					public void onValueChange(NumberPicker arg0, int arg1,
							int arg2) {
						monthSwitch(arg2);
						updateText();
					}
				});

		// spinner wheel listeners to get the previous result or current spin.
		letter_picker
				.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
					public void onValueChange(NumberPicker arg0, int arg1,
							int arg2) {
						letterSwitch(arg2);
						colourSwitch(arg2);
						updateText();
					}
				});
		cocktail_click();
	}

	//method for taking you to the recipe screen when you click a cocktail.
	public void cocktail_click(){
		ImageView cBtn = (ImageView)findViewById(R.id.cocktail_image);
		cBtn.setOnClickListener(new View.OnClickListener()   {             
			public void onClick(View v) {
				Intent intent = new Intent(
						MainActivity.this,
						cocktail_recipe.class
						);
					startActivity(intent);
			}
		});
	}

	// changes the text after each spin. As used in the listener methods
	// for both spinners in the app.
	public void updateText() {
		TextView t = new TextView(this);
		t = (TextView) findViewById(R.id.cocktail_name);
		t.setText(letterName + " " + monthName);
	}

	// Changes the colour of the drink name and the background of the
	// name depending on what letter is clicked.
	public void colourSwitch(int i) {
		TextView tv = (TextView) findViewById(R.id.cocktail_name);

		switch (i) {
		case 0:
			tv.setTextColor(getResources().getColor(R.color.text_color_1));
			tv.setBackgroundColor(getResources().getColor(R.color.background_1));
			break;
		case 1:
			tv.setTextColor(getResources().getColor(R.color.text_color_2));
			tv.setBackgroundColor(getResources().getColor(R.color.background_2));
			break;
		case 2:
			tv.setTextColor(getResources().getColor(R.color.text_color_3));
			tv.setBackgroundColor(getResources().getColor(R.color.background_3));
			break;
		case 3:
			tv.setTextColor(getResources().getColor(R.color.text_color_4));
			tv.setBackgroundColor(getResources().getColor(R.color.background_4));
			break;
		case 4:
			tv.setTextColor(getResources().getColor(R.color.text_color_5));
			tv.setBackgroundColor(getResources().getColor(R.color.background_5));
			break;
		case 5:
			tv.setTextColor(getResources().getColor(R.color.text_color_6));
			tv.setBackgroundColor(getResources().getColor(R.color.background_6));
			break;
		case 6:
			tv.setTextColor(getResources().getColor(R.color.text_color_7));
			tv.setBackgroundColor(getResources().getColor(R.color.background_7));
			break;
		case 7:
			tv.setTextColor(getResources().getColor(R.color.text_color_8));
			tv.setBackgroundColor(getResources().getColor(R.color.background_8));
			break;
		case 8:
			tv.setTextColor(getResources().getColor(R.color.text_color_9));
			tv.setBackgroundColor(getResources().getColor(R.color.background_9));
			break;
		case 9:
			tv.setTextColor(getResources().getColor(R.color.text_color_10));
			tv.setBackgroundColor(getResources()
					.getColor(R.color.background_10));
			break;
		case 10:
			tv.setTextColor(getResources().getColor(R.color.text_color_11));
			tv.setBackgroundColor(getResources()
					.getColor(R.color.background_11));
			break;
		case 11:
			tv.setTextColor(getResources().getColor(R.color.text_color_12));
			tv.setBackgroundColor(getResources()
					.getColor(R.color.background_12));
			break;
		case 12:
			tv.setTextColor(getResources().getColor(R.color.text_color_1));
			tv.setBackgroundColor(getResources().getColor(R.color.background_1));
			break;
		case 13:
			tv.setTextColor(getResources().getColor(R.color.text_color_2));
			tv.setBackgroundColor(getResources().getColor(R.color.background_2));
			break;
		case 14:
			tv.setTextColor(getResources().getColor(R.color.text_color_3));
			tv.setBackgroundColor(getResources().getColor(R.color.background_3));
			break;
		case 15:
			tv.setTextColor(getResources().getColor(R.color.text_color_4));
			tv.setBackgroundColor(getResources().getColor(R.color.background_4));
			break;
		case 16:
			tv.setTextColor(getResources().getColor(R.color.text_color_5));
			tv.setBackgroundColor(getResources().getColor(R.color.background_5));
			break;
		case 17:
			tv.setTextColor(getResources().getColor(R.color.text_color_6));
			tv.setBackgroundColor(getResources().getColor(R.color.background_6));
			break;
		case 18:
			tv.setTextColor(getResources().getColor(R.color.text_color_7));
			tv.setBackgroundColor(getResources().getColor(R.color.background_7));
			break;
		case 19:
			tv.setTextColor(getResources().getColor(R.color.text_color_8));
			tv.setBackgroundColor(getResources().getColor(R.color.background_8));
			break;
		case 20:
			tv.setTextColor(getResources().getColor(R.color.text_color_9));
			tv.setBackgroundColor(getResources().getColor(R.color.background_9));
			break;
		case 21:
			tv.setTextColor(getResources().getColor(R.color.text_color_10));
			tv.setBackgroundColor(getResources()
					.getColor(R.color.background_10));
			break;
		case 22:
			tv.setTextColor(getResources().getColor(R.color.text_color_11));
			tv.setBackgroundColor(getResources()
					.getColor(R.color.background_11));
			break;
		case 23:
			tv.setTextColor(getResources().getColor(R.color.text_color_12));
			tv.setBackgroundColor(getResources()
					.getColor(R.color.background_12));
			break;
		case 24:
			tv.setTextColor(getResources().getColor(R.color.text_color_1));
			tv.setBackgroundColor(getResources().getColor(R.color.background_1));
			break;
		case 25:
			tv.setTextColor(getResources().getColor(R.color.text_color_2));
			tv.setBackgroundColor(getResources().getColor(R.color.background_2));
			break;
		default:
			break;
		}
	}

	// Changes part of the name of the drink depending on what month is chosen
	// It will then also change the picture that goes with that month.
	public void monthSwitch(int i) {
		String[] testArray = getResources().getStringArray(R.array.name_month);
		ImageView imageView = (ImageView) findViewById(R.id.cocktail_image);

		switch (i) {
		case 0:
			monthName = testArray[0].toString();
			imageView.setImageResource(R.drawable.image_1);
			break;
		case 1:
			monthName = testArray[1].toString();
			imageView.setImageResource(R.drawable.image_2);
			break;
		case 2:
			monthName = testArray[2].toString();
			imageView.setImageResource(R.drawable.image_3);
			break;
		case 3:
			monthName = testArray[3].toString();
			imageView.setImageResource(R.drawable.image_4);
			break;
		case 4:
			monthName = testArray[4].toString();
			imageView.setImageResource(R.drawable.image_5);
			break;
		case 5:
			monthName = testArray[5].toString();
			imageView.setImageResource(R.drawable.image_6);
			break;
		case 6:
			monthName = testArray[6].toString();
			imageView.setImageResource(R.drawable.image_7);
			break;
		case 7:
			monthName = testArray[7].toString();
			imageView.setImageResource(R.drawable.image_8);
			break;
		case 8:
			monthName = testArray[8].toString();
			imageView.setImageResource(R.drawable.image_9);
			break;
		case 9:
			monthName = testArray[9].toString();
			imageView.setImageResource(R.drawable.image_10);
			break;
		case 10:
			monthName = testArray[10].toString();
			imageView.setImageResource(R.drawable.image_11);
			break;
		case 11:
			monthName = testArray[11].toString();
			imageView.setImageResource(R.drawable.image_12);
			break;
		default:
			break;
		}
	}

	// Changes part of the name depending on what initial is chosen.
	public void letterSwitch(int i) {
		String[] testArray = getResources().getStringArray(R.array.name_letter);

		switch (i) {
		case 0:
			letterName = testArray[0].toString();
			break;
		case 1:
			letterName = testArray[1].toString();
			break;
		case 2:
			letterName = testArray[2].toString();
			break;
		case 3:
			letterName = testArray[3].toString();
			break;
		case 4:
			letterName = testArray[4].toString();
			break;
		case 5:
			letterName = testArray[5].toString();
			break;
		case 6:
			letterName = testArray[6].toString();
			break;
		case 7:
			letterName = testArray[7].toString();
			break;
		case 8:
			letterName = testArray[8].toString();
			break;
		case 9:
			letterName = testArray[9].toString();
			break;
		case 10:
			letterName = testArray[10].toString();
			break;
		case 11:
			letterName = testArray[11].toString();
			break;
		case 12:
			letterName = testArray[12].toString();
			break;
		case 13:
			letterName = testArray[13].toString();
			break;
		case 14:
			letterName = testArray[14].toString();
			break;
		case 15:
			letterName = testArray[15].toString();
			break;
		case 16:
			letterName = testArray[16].toString();
			break;
		case 17:
			letterName = testArray[17].toString();
			break;
		case 18:
			letterName = testArray[18].toString();
			break;
		case 19:
			letterName = testArray[19].toString();
			break;
		case 20:
			letterName = testArray[20].toString();
			break;
		case 21:
			letterName = testArray[21].toString();
			break;
		case 22:
			letterName = testArray[22].toString();
			break;
		case 23:
			letterName = testArray[23].toString();
			break;
		case 24:
			letterName = testArray[24].toString();
			break;
		case 25:
			letterName = testArray[25].toString();
			break;
		default:
			break;
		}
	}

	// Options menu creating and operations.
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// Options item selected operations.
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
