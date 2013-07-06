package com.example.sicla;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class InicioCliente extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.iniciocliente);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio_cliente, menu);
		return true;
	}
	
	public void fretecliente(View button) {
		startActivity(new Intent(this, FreteCliente.class));
	}
	
	public void contatocliente(View button) {
		startActivity(new Intent(this, ContatoCliente.class));
	}
	
	public void logincliente(View button) {
		startActivity(new Intent(this, LoginCliente.class));
	}
}
