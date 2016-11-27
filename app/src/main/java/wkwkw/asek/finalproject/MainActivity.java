package wkwkw.asek.finalproject;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import wkwkw.asek.finalproject.ImageAdapter.SlidingImage_Adapter;
import wkwkw.asek.finalproject.Magelang.Magelang;
import wkwkw.asek.finalproject.Malang.Malang;
import wkwkw.asek.finalproject.Yogyakarta.Yogyakarta;
import wkwkw.asek.finalproject.gridview.CustomGridViewActivity;

public class MainActivity extends AppCompatActivity {

    GridView androidGridView;

    HashMap<String,String> Hash_file_maps ;

    String[] gridViewString = {
            "Malang", "Magelang", "Yogyakarta", "Tips Berlibur",

    } ;
    int[] gridViewImageId = {
            R.drawable.malang, R.drawable.magelang,R.drawable.jogja,R.drawable.tips,

    };

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.malang, R.drawable.magelang,R.drawable.jogja,R.drawable.gambar1,R.drawable.gambar2};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Indonesia Tourism");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator( getResources().getDrawable(R.mipmap.ic_launcher) );
        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(MainActivity.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.lv_item);
        androidGridView.setAdapter(adapterViewAndroid);
        /*make image slider*/

        init();
        /*check internet connection*/
        checkInternetConnection();
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(getApplicationContext(), Malang.class);
                        startActivity(newActivity);
                        finish();
                        break;
                    case 1:  Intent newActivity1 = new Intent(getApplicationContext(), Magelang.class);
                        startActivity(newActivity1);
                        finish();
                        break;
                    case 2:  Intent newActivity2 = new Intent(getApplicationContext(), Yogyakarta.class);
                        startActivity(newActivity2);
                        finish();
                        break;
                    case 3:  Intent newActivity3 = new Intent(getApplicationContext(), Main2Activity.class);
                        startActivity(newActivity3);
                        finish();
                        break;

                }}
        });

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


        return super.onOptionsItemSelected(item);
    }

    /*function to check internet conection*/
    private boolean checkInternetConnection() {
        ConnectivityManager conMgr = (ConnectivityManager) getSystemService (Context.CONNECTIVITY_SERVICE);
        if (conMgr.getActiveNetworkInfo() != null && conMgr.getActiveNetworkInfo().isAvailable() &&    conMgr.getActiveNetworkInfo().isConnected()) {
            Toast.makeText(getApplicationContext(),"Internet terhubung",Toast.LENGTH_LONG).show();
            return true;
        } else {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setTitle("WARNINGGGG");
            builder1.setMessage("Internet tidak terhubung. Hubungkan internet jika anda ingin melihat foto tempat Wisata");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Settings",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Intent intent = new Intent();
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            intent.setAction(Settings.ACTION_SETTINGS);
                            startActivity(intent);
                        }
                    });

            builder1.setNegativeButton(
                    "Abaikan",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
            return false;
        }
    }

    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) findViewById(R.id.pager);


        mPager.setAdapter(new SlidingImage_Adapter(MainActivity.this,ImagesArray));


        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 9000, 7000);


    }
}
