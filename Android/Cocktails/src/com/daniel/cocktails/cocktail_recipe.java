package com.daniel.cocktails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class cocktail_recipe extends Activity {

	static String letterName = "";
	static String monthName = "";
	static String letterRecipe = "";
	static String monthRecipe = "";

	//Initialises the names and the back button, using the back_click method
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cocktail_click);

		back_click();

		letterName = MainActivity.letterName;
		monthName = MainActivity.monthName;
		updateText();
		updateRecipe();
	}

	//get the names and uses the same names as when the image was clicked
	public void updateText() {
		TextView t = new TextView(this);
		t = (TextView) findViewById(R.id.cocktail_name);
		t.setText(letterName + " " + monthName);
	}

	//updates the recipe text feild
	public void updateRecipe() {
		monthSwitch(monthName.toString());
		letterSwitch(letterName.toString());

		TextView g = new TextView(this);
		g = (TextView) findViewById(R.id.recipe);
		g.setText(letterRecipe + "\n" + monthRecipe);
	}

	//switch statement to change half of the recipe based on the letter
	public void letterSwitch(String g) {
		String[] testArray2 = getResources().getStringArray(
				R.array.letter_recipe);

		switch (g) {
		case "Randy":
			letterRecipe = testArray2[0].toString();
			break;
		case "Sweet":
			letterRecipe = testArray2[1].toString();
			break;
		case "Hot":
			letterRecipe = testArray2[2].toString();
			break;
		case "Sexy":
			letterRecipe = testArray2[3].toString();
			break;
		case "Smokin":
			letterRecipe = testArray2[4].toString();
			break;
		case "Slippery":
			letterRecipe = testArray2[5].toString();
			break;
		case "Gorgeous":
			letterRecipe = testArray2[6].toString();
			break;
		case "Handsome":
			letterRecipe = testArray2[7].toString();
			break;
		case "Leggy":
			letterRecipe = testArray2[8].toString();
			break;
		case "Blonde":
			letterRecipe = testArray2[9].toString();
			break;
		case "Spicy":
			letterRecipe = testArray2[10].toString();
			break;
		case "High":
			letterRecipe = testArray2[11].toString();
			break;
		case "Running":
			letterRecipe = testArray2[12].toString();
			break;
		case "Sucking":
			letterRecipe = testArray2[13].toString();
			break;
		case "Jelly":
			letterRecipe = testArray2[14].toString();
			break;
		case "Frigid":
			letterRecipe = testArray2[15].toString();
			break;
		case "Juicy":
			letterRecipe = testArray2[16].toString();
			break;
		case "Kissing":
			letterRecipe = testArray2[17].toString();
			break;
		case "Sunset":
			letterRecipe = testArray2[18].toString();
			break;
		case "Blazing":
			letterRecipe = testArray2[19].toString();
			break;
		case "Lovely":
			letterRecipe = testArray2[20].toString();
			break;
		case "Spotted":
			letterRecipe = testArray2[21].toString();
			break;
		case "Brass":
			letterRecipe = testArray2[22].toString();
			break;
		case "Dirty":
			letterRecipe = testArray2[23].toString();
			break;
		case "Zombie":
			letterRecipe = testArray2[24].toString();
			break;
		case "Moscow":
			letterRecipe = testArray2[25].toString();
			break;
		default:
			break;
		}
	}

	//switch statement to change half of the recipe based on the month
	public void monthSwitch(String g) {
		String[] testArray1 = getResources().getStringArray(
				R.array.month_recipe);
		ImageView imageView1 = (ImageView) findViewById(R.id.cocktail_image1);

		switch (g) {
		case "Frolic":
			imageView1.setImageResource(R.drawable.image_1);
			monthRecipe = testArray1[0].toString();
			break;
		case "Dingo":
			imageView1.setImageResource(R.drawable.image_2);
			monthRecipe = testArray1[1].toString();
			break;
		case "Wolf":
			imageView1.setImageResource(R.drawable.image_3);
			monthRecipe = testArray1[2].toString();
			break;
		case "Satan":
			imageView1.setImageResource(R.drawable.image_4);
			monthRecipe = testArray1[3].toString();
			break;
		case "Tiger":
			imageView1.setImageResource(R.drawable.image_5);
			monthRecipe = testArray1[4].toString();
			break;
		case "Puma":
			imageView1.setImageResource(R.drawable.image_6);
			monthRecipe = testArray1[5].toString();
			break;
		case "Lion":
			imageView1.setImageResource(R.drawable.image_7);
			monthRecipe = testArray1[6].toString();
			break;
		case "Jaguar":
			imageView1.setImageResource(R.drawable.image_8);
			monthRecipe = testArray1[7].toString();
			break;
		case "Beast":
			imageView1.setImageResource(R.drawable.image_9);
			monthRecipe = testArray1[8].toString();
			break;
		case "Cheetah":
			imageView1.setImageResource(R.drawable.image_10);
			monthRecipe = testArray1[9].toString();
			break;
		case "Leopard":
			imageView1.setImageResource(R.drawable.image_11);
			monthRecipe = testArray1[10].toString();
			break;
		case "Panther":
			imageView1.setImageResource(R.drawable.image_12);
			monthRecipe = testArray1[11].toString();
			break;
		default:
			break;
		}
	}
 
	//method for making the back button work
	public void back_click() {
		ImageButton bBtn = (ImageButton) findViewById(R.id.backButton);
		bBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
