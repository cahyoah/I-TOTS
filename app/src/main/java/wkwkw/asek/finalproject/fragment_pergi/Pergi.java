package wkwkw.asek.finalproject.fragment_pergi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import wkwkw.asek.finalproject.Main2Activity;
import wkwkw.asek.finalproject.R;

public class Pergi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergi);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().
                    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                    add(R.id.frame_container,
                            new Pergi_1(),
                            Pergi_1.class.getSimpleName()).commit();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
            finish();
        }


        return super.onOptionsItemSelected(item);
    }
}
