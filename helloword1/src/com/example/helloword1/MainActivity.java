package com.example.helloword1;

import android.os.Bundle;
import android.app.Activity;
/*comment -2-2*/
import android.view.Menu;
/*comment -1-1*/
/*comment -1*/
public class MainActivity extends Activity {
/*comment -2-2*/
/*commennt 0*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	/*comment 000000000*/
		super.onCreate(savedInstanceState);
		/*comment 0000000*/
		setContentView(R.layout.activity_main);
	}

/*comment1*/
/*enter comment 2*/
/*enter comment 2*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
<<<<<<< HEAD
	/*insert 111*/
	
=======
	/*12345678*/
>>>>>>> remotes/origin/master
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		/**insert 000*/
		
		return true;
		
		/*insert 222*/
	}
/*comment1*/
}
/*comment*//*comment 122*//*comment*//*comment - 11*/