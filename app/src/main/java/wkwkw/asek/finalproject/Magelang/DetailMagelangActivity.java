package wkwkw.asek.finalproject.Magelang;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import wkwkw.asek.finalproject.R;

public class DetailMagelangActivity extends AppCompatActivity {
    public static String KEY_ITEM = "item";
    private TextView txtDetail,txtDetail1;
    private ImageView imgDetail;
    private MagelangModel item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_magelang);
        getSupportActionBar().setTitle("Detail Wisata");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtDetail = (TextView)findViewById(R.id.txt_detail);
        txtDetail1=(TextView)findViewById(R.id.textView);
        imgDetail = (ImageView)findViewById(R.id.img_detail);

        item = (MagelangModel) getIntent().getSerializableExtra(KEY_ITEM);

        txtDetail.setText(Html.fromHtml(item.getSubtitle()));
        txtDetail1.setText(Html.fromHtml(item.getTitle()));
        Picasso.with(DetailMagelangActivity.this).load(item.getImage()).into(imgDetail);

        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.locate);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q="+item.getTitle()));
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.share, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            share();
            return true;
        }

        if (id == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void share() {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Ayo wisata ke "+item.getTitle() + "  " + item.getSubtitle());
        sendIntent.putExtra(Intent.EXTRA_TITLE, "Tempat wisata magelang");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}