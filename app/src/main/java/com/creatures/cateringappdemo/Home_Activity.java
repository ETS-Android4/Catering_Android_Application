package com.creatures.cateringappdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import org.w3c.dom.Text;

import java.util.List;

public class Home_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView rv_food_by_cat,rv_book_by_thali;
    TextView tv_viewall_cat,tv_viewall_thali;
    /*

    List<String> cat_title;
    List<Integer> cat_img;

    List<String> pro_title;
    List<Integer> pro_img;

     */
    DrawerLayout drawer;
    LinearLayoutManager HorizontalLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_home_portal);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Catering App");

        rv_food_by_cat=(RecyclerView)findViewById(R.id.recyclerView_food_by_cat);
        rv_book_by_thali=(RecyclerView)findViewById(R.id.recyclerView_book_by_thali);
        tv_viewall_cat=(TextView)findViewById(R.id.tv_view_all_category);
        tv_viewall_thali=(TextView)findViewById(R.id.tv_view_all_thali);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        //navigationView.setItemIconTintList(null);

        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case (R.id.nav_cart):
                Toast.makeText(this , "Your Cart" , Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case (R.id.nav_setting):
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.nav_logout):
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.nav_help):
                Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.nav_motivational):
                Toast.makeText(this, "Motivational", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.nav_job):
                Toast.makeText(this, "Job", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}