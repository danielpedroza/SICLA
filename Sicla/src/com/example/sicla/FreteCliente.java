package com.example.sicla;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class FreteCliente extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fretecliente);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.frete_cliente, menu);
		return true;
	}
	
	public void iniciocliente(View button) {
		startActivity(new Intent(this, InicioCliente.class));
	}

	public void contatocliente(View button) {
		startActivity(new Intent(this, ContatoCliente.class));
	}
	
	public void logincliente(View button) {
		startActivity(new Intent(this, LoginCliente.class));
	}

	
}
