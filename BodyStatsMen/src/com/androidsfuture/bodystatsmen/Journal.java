package com.androidsfuture.bodystatsmen;

import static com.androidsfuture.bodystatsmen.Constants.TABLE_NAME_02;

import java.util.Calendar;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.AdapterContextMenuInfo;

public class Journal extends Activity implements OnClickListener {
	

	
	private TextView mDateDisplay;
	private TextView mTimeDisplay;
	private String currentTime;
    private int mYear;
    private int mMonth;
    private int mDay;
    private int mHour;
    private int mMinute;
    private String Month;
	
   
	private BodyDbAdapter mDbHelper;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.journal);
        
        mDbHelper = new BodyDbAdapter(this);
        
        
        View saveButton = this.findViewById(R.id.Journal_Save_Button);
        	saveButton.setOnClickListener(this);
        View clearButton = this.findViewById(R.id.Journal_Clear_Button);
        	clearButton.setOnClickListener(this);
        View listButton = this.findViewById(R.id.Journal_List_Button);
         	listButton.setOnClickListener(this);

         	            
            
            
         // capture our View elements
            mDateDisplay = (TextView) findViewById(R.id.Journal_Date);
            mTimeDisplay = (TextView)findViewById(R.id.Journal_Text_Time);
            
            // get the current date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            
          //Display month in text instead of a number
    		 switch (mMonth){
    		 case 0:
    			 Month = "January";
    			 break;
    		 case 1:
    			 Month = "February";
    			 break;
    		 case 2:
    			 Month = "March";
    			 break;
    		 case 3:
    			 Month = "April";
    			 break;
    		 case 4:
    			 Month = "May";
    			 break;
    		 case 5:
    			 Month = "June";
    			 break;
    		 case 6:
    			 Month = "July";
    			 break;
    		 case 7:
    			 Month = "August";
    			 break;
    		 case 8:
    			 Month = "September";
    			 break;
    		 case 9:
    			 Month = "October";
    			 break;
    		 case 10:
    			 Month = "November";
    			 break;
    		 case 11:
    			 Month = "December";
    			 break;
    			 
    		 }

            // display the current date (this method is below)
            updateDisplay();
        }

        //Display the current date
    	private void updateDisplay() {
    		 mDateDisplay.setText(
    		            new StringBuilder()
    		                    // Month is 0 based so add 1
    		                    //.append(mMonth + 1).append("-")
    		            		.append(Month).append(" ")
    		                    .append(mDay).append(", ")
    		                    .append(mYear).append(" "));
    		 
    		 mTimeDisplay.setText(
    			        new StringBuilder()
    			                .append(pad(mHour)).append(":")
    			                .append(pad(mMinute)));

    		
    	}
      
    	private static String pad(int c) {
    	    if (c >= 10)
    	        return String.valueOf(c);
    	    else
    	        return "0" + String.valueOf(c);
    	}
       
    
    public void saveJournal(){
    	
    	String Date = mDateDisplay.getText().toString();
    	String Time = mTimeDisplay.getText().toString();
    	String Journal = ((EditText)findViewById(R.id.JournalEntry)).getText().toString(); 
    
 
		if (Journal.equals("")){
			Toast.makeText(this, "There is no journal entry to save.", Toast.LENGTH_SHORT).show();	
		}else{
        	
        	try {
        		saveEntry(Date, Time, Journal);
        		clearJournal();
        		
        	}finally{
        		mDbHelper.close();
        	}
		}

    }



	public void saveEntry(String date, String time, String entry){
    	
    	SQLiteDatabase db = mDbHelper.getWritableDatabase();
    	ContentValues values = new ContentValues();
    		values.put(BodyDbAdapter.KEY_DATE, date);
    		values.put(BodyDbAdapter.KEY_TIME, time);
    		values.put(BodyDbAdapter.KEY_ENTRY, entry);
    	db.insertOrThrow(TABLE_NAME_02, null, values);
    	Toast.makeText(this, "Journal entry saved!", Toast.LENGTH_SHORT).show();
    }
    
    public void clearJournal(){
    	 EditText Journal = ((EditText)findViewById(R.id.JournalEntry));
    	 Journal.getText().clear();
    	
    }
    
   

	public void onClick(View v) {
		switch(v.getId()){
		case R.id.Journal_Save_Button:
			saveJournal();
			break;
			
		case R.id.Journal_Clear_Button:
			clearJournal();
			break;
			
		case R.id.Journal_List_Button:
			startActivity(new Intent(this, JournalList.class));
			break;
		
		}
	}
	
}
