package com.morangesoft.clinicamontesur;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;


public class MedicosActivity extends AppCompatActivity    implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicos);




        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Médico");
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(MedicosActivity.this);
        FloatingActionButton fab = findViewById(R.id.nav_cart);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        Intent i;
      //  final TextView textView = findViewById(R.id.section_label);
        if (id == R.id.medico)
        {
            Intent myIntent = new Intent(this, MedicosActivity.class);
            startActivity(myIntent);
        }
        if (id == R.id.cita)
        {
            Intent myIntent = new Intent(this, miembros.class);
            startActivity(myIntent);
        }
        if (id == R.id.consulta)
        {
            Intent myIntent = new Intent(this, Configuration.class);
            startActivity(myIntent);
        }
        if (id == R.id.perfil)
        {
            Intent myIntent = new Intent(this, MembersPage.class);
            startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}