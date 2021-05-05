package com.example.demofragments;


import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;


public class DetalleActivity extends FragmentActivity {
    public static final String EXTRA_TEXTO =  "com.example.demo.fragments.EXTRA_TEXTO";



protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detalle);
    FragmentDetalle detalle = (FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
    detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));
}

}
