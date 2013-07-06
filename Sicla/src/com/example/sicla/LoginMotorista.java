package com.example.sicla;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class LoginMotorista extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginmotorista);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_motorista, menu);
		return true;
	}
	
	public void menuprincipal(View buttons){
		startActivity(new Intent(this, MenuPrincipal.class));
	}

	
	
	public void iniciomotorista(View buttons){
		startActivity(new Intent(this, InicioMotorista.class));
	}

	public void cadastromotorista(View buttons){
		startActivity(new Intent(this, CadastroMotorista.class));
	}
}
