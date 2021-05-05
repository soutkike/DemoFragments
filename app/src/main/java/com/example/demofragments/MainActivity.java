package com.example.demofragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import com.example.demofragments.FragmentListado.CorreosListener;
public class MainActivity extends FragmentActivity implements CorreosListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentListado frgListado
                =(FragmentListado)getSupportFragmentManager()
                .findFragmentById(R.id.FrgListado);

        frgListado.setCorreosListener(this);
    }

    @Override
    public void onCorreoSeleccionado(Correo c) {
        boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);
        if(hayDetalle) {
        ((FragmentDetalle)getSupportFragmentManager()
                .findFragmentById(R.id.FrgDetalle)).mostrarDetalle(c.getTexto());
        }
        else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO, c.getTexto());
            startActivity(i);
        }


    }
}
