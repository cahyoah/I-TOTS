package wkwkw.asek.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    private static final int Splash_Time = 2200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        /*to hide toolbar*/
        getSupportActionBar().hide();
    new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gomenu =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(gomenu);
                finish();
            }
        },Splash_Time);
    }

}
