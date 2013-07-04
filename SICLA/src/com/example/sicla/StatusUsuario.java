package com.example.sicla;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StatusUsuario extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.statususuario);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.status_usuario, menu);
		return true;
	}

}
