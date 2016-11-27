package wkwkw.asek.finalproject.Magelang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import wkwkw.asek.finalproject.MainActivity;
import wkwkw.asek.finalproject.Malang.DetailMalangActivity;
import wkwkw.asek.finalproject.R;


public class Magelang extends AppCompatActivity {
    String[][] data = new String[][]{
            {"Alun-Alun Kota ", "Kota Magelang","http://tempatwisataindonesia.id/wp-content/uploads/2016/06/Alun-alun-Kota-Magelang-635x420.jpg"},

            {"Punthuk Setumbu", "Dusun Kerahan, Desa Karangrejo, Borobudur, Magelang","https://panwis.com/wp-content/uploads/2015/10/Punthuk-Setumbu.jpg"},
            {"Candi Borobudur", "Kecamatan Borobudur, Kabupaten Magelang, Jawa Tengah.","https://panwis.com/wp-content/uploads/2015/10/Candi-Borobudur.jpg"},
            {"Gereja Ayam", "Dusun Gombong, Desa Kembanglimus, Kecamatan Borobudur, Magelang.","https://panwis.com/wp-content/uploads/2015/10/Gereja-Ayam-dari-Udara.jpg"},
            {"Camera House Borobudur", " Jalan Majaksingi, Kecamatan Borobudur, Magelang, Jawa Tengah.","https://panwis.com/wp-content/uploads/2015/10/Rumah-Kamera.jpg"},
            {"Ketep Pass", "Desa Ketep, kec. Sawangan, Kab. Magelang, Jawa Tengah","https://panwis.com/wp-content/uploads/2015/10/Ketep-Pass.jpg"},
            {"Candi Umbul", "Desa Kartoharjo, Kecamatan Grabag, Kab. Magelang, Jawa Tengah.","https://panwis.com/wp-content/uploads/2015/10/Candi-Umbul.jpg"},
            {"Candi Mendut", "Kab. Magelang, Jawa Tengah.","http://tempatwisataindonesia.id/wp-content/uploads/2016/06/Candi-Mendut-640x416.jpg"},
            {"Candi Selogriyo", "Dusun Campurejo, Desa Kembangkuning, Kecamatan Windusari, Kabupaten Magelang","http://tempatwisataindonesia.id/wp-content/uploads/2016/06/Candi-Selogriyo-630x420.jpg"},
            {"Candi Ngawen", "Kecamatan Muntilan, Kabupaten Magelang","http://tempatwisataindonesia.id/wp-content/uploads/2016/06/Candi-Ngawen-640x283.jpg"},
            {"Candi Gunung Sari", "Dusun Gulon, Kecamatan Salam, Kabupaten Magelang,","http://tempatwisataindonesia.id/wp-content/uploads/2016/06/Candi-Gunung-Sari.jpg"},
            {"Pinusan Kragilan Magelang", "Kaponan, Kecamatan Pakis","http://tempatwisataindonesia.id/wp-content/uploads/2016/08/Top-Selfie-Pinusan-Kragilan-Magelang.png"},
            {"Taman Kyai Langgeng", "Jalan Cempaka Kota Magelang","http://tempatwisataindonesia.id/wp-content/uploads/2016/06/Taman-Kyai-Langgeng-564x420.jpg"},

            {"Air Terjun Sekar Langit", "Desa Telogorejo, Kecamatan Grabag, Kabupaten Magelang","http://tempatwisataindonesia.id/wp-content/uploads/2016/06/Air-Terjun-Sekar-Langit-640x401.jpg"},

            {"Pecinan Magelang", "Jalan Pemuda, Kota Magelang, Jawa Tengah.","https://panwis.com/wp-content/uploads/2015/10/pecinan-magelang.jpg"},
            {"Curug Silawe", "Dusun Kopeng Kulon, desa sutopati, kecamatan kajoran, kab magelang.","https://panwis.com/wp-content/uploads/2015/10/curug-silawe.jpg"},
            {"Grojogan Kedung Kayang", "desa wonolelo, kecamatan sawangan, kabupaten magelang.","https://panwis.com/wp-content/uploads/2015/10/Gojokan-Kedung-Kayang.jpg"}
    };

    private ListView test;
    private ArrayList listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Magelang City");
        test = (ListView)findViewById(R.id.lv_item);
        listItem = new ArrayList<>();

        MagelangModel mobil = null;

        for (int i = 0; i < data.length; i++){
            mobil = new MagelangModel();
            mobil.setTitle(data[i][0]);
            mobil.setSubtitle(data[i][1]);
            mobil.setImage(data[i][2]);

            listItem.add(mobil);
        }
        MagelangAdapter adapter = new MagelangAdapter(Magelang.this, listItem);
        test.setAdapter(adapter);

        test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MagelangModel mbl = (MagelangModel) listItem.get(position);

                Intent intent = new Intent(Magelang.this, DetailMagelangActivity.class);
                intent.putExtra(DetailMalangActivity.KEY_ITEM, mbl);
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
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