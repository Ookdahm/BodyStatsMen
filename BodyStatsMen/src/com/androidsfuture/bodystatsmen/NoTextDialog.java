package com.androidsfuture.bodystatsmen;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class NoTextDialog extends Activity implements OnTouchListener  {


	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState); 
	
	setContentView(R.layout.no_text_dialog);
	
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		int action = event.getAction();
		if (action == MotionEvent.ACTION_DOWN) {
			this.finish();
		}
		
		return true;
		
		
	}

	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}	
}	
