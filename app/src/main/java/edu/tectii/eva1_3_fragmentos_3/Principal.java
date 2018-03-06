package edu.tectii.eva1_3_fragmentos_3;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction trans;
    AzulFragment afazul;
    RojoFragment rfrojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        manager = getSupportFragmentManager();

    }
    public  void onClickazul(View view){
        trans = manager.beginTransaction();
        //creamos el fragmento
        afazul = new AzulFragment();
        trans.replace(R.id.layout_bites,afazul);
        trans.commit();
    }
    public  void onClickrojo(View view){
        trans = manager.beginTransaction();
        //creamos el fragmento
        rfrojo = new RojoFragment();
        trans.replace(R.id.layout_bites,rfrojo);
        trans.commit();
    }
}
