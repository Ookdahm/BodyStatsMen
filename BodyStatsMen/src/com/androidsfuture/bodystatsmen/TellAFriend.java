package com.androidsfuture.bodystatsmen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class TellAFriend extends Activity {
	
	String[] Me = new String[] {};
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		Intent sendTo = new Intent(android.content.Intent.ACTION_SEND);
		sendTo.putExtra(android.content.Intent.EXTRA_EMAIL, Me);
		sendTo.putExtra(android.content.Intent.EXTRA_SUBJECT, "Here's a great new app called Body Stats - Men");
		sendTo.putExtra(android.content.Intent.EXTRA_TEXT, "Here's an app I've started using that I think " +
													"you will like called Body Stats. It saves your body stats, " +
													"graphs them and even has links to keep you motivated. " +
													"It even helps you find a womens only gym.");
		sendTo.addCategory(Intent.CATEGORY_DEFAULT);
		sendTo.setType("text/plain");
        startActivity(Intent.createChooser(sendTo, "Tell A Friend Using"));   
        finish();

	}
	


}
