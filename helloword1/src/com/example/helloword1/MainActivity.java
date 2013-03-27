package com.example.helloword1;

import android.os.Bundle;
import android.app.Activity;
/*comment -2-2*/
import android.view.Menu;
/*comment -1*/
public class MainActivity extends Activity {
/*commennt 0*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

/*comment1*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	/*12345678*/
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		/**insert 000*/
		
		return true;
	}
/*comment1*/
}
/*comment*//*comment 122*//*comment*//*comment - 11*/