package com.dicoding.galaksi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGalaksi;
    private ArrayList<Galaksi> list = new ArrayList<>();
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvGalaksi = findViewById(R.id.rv_galaksi);
        rvGalaksi.setHasFixedSize(true);

        list.addAll(GalaksiData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvGalaksi.setLayoutManager(new LinearLayoutManager(this));
        ListGalaksiAdapter listGalaksiAdapter = new ListGalaksiAdapter(list);
        rvGalaksi.setAdapter(listGalaksiAdapter);

        listGalaksiAdapter.setOnItemClickCallback(new ListGalaksiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Galaksi data) {
                Intent details=new Intent(MainActivity.this, Details.class);
                details.putExtra(Details.name, data.getName());
                details.putExtra(Details.detail, data.getDetail());
                details.putExtra(Details.photo, data.getPhoto());

                startActivity(details);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;

            case R.id.action_about:
                showRecyclerAbout();
                break;
        }
        setActionBarTitle(title);
    }


    private void showRecyclerGrid(){
        rvGalaksi.setLayoutManager(new GridLayoutManager(this, 2));
        GridGalaksiAdapter gridGalaksiAdapter = new GridGalaksiAdapter(list);
        rvGalaksi.setAdapter(gridGalaksiAdapter);
    }

    private void showRecyclerCardView(){
        rvGalaksi.setLayoutManager(new LinearLayoutManager(this));
        CardViewGalaksiAdapter cardViewGalaksiAdapter = new CardViewGalaksiAdapter(list);
        rvGalaksi.setAdapter(cardViewGalaksiAdapter);
    }
        ImageView imgPhoto;
    private void showRecyclerAbout() {
        startActivity(new Intent(this, About.class));
    }

    private void setActionBarTitle(String title) {
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}