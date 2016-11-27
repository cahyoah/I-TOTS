package wkwkw.asek.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import wkwkw.asek.finalproject.adapter.TabFragmentPagerAdapter;

public class Main2Activity extends AppCompatActivity {
    //deklarasi semua komponen View yang akan digunakan

    private ViewPager pager;
    private TabLayout tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //set up toolbar

        getSupportActionBar().setTitle("Tips Berlibur");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


         //inisialisasi tab dan pager
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        //set object adapter kedalam ViewPager

        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        //Manimpilasi sedikit untuk set TextColor pada Tab
        tabs.setTabTextColors(getResources().getColor(R.color.colorGray),
        getResources().getColor(android.R.color.background_dark));

         //set tab ke ViewPager
        tabs.setupWithViewPager(pager);

        //konfigurasi Gravity Fill untuk Tab berada di posisi yang proposional
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
            finish();
        }
        if (id == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }


        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}