package com.example.sicla;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class LoginCliente extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logincliente);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_cliente, menu);
		return true;
	}

	public void iniciocliente(View button) {
		startActivity(new Intent(this, InicioCliente.class));
	}
	
	public void menuprincipal(View button) {
		startActivity(new Intent(this, MenuPrincipal.class));
	}

	public void cadastrocliente(View buttons){
		startActivity(new Intent(this, CadastroCliente.class));
	}
}
