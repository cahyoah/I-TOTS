package wkwkw.asek.finalproject.Malang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import wkwkw.asek.finalproject.MainActivity;
import wkwkw.asek.finalproject.R;


public class Malang extends AppCompatActivity {
    String[][] data = new String[][]{
            {"Museum Angkut",           "Jl. Terusan Sultan Agung No. 2, Ngaglik, Kota Batu, Jawa Timur 65314",         "http://halomuda.com/wp-content/uploads/2016/06/Museum-Angkut.jpg"},
            {"Batu Night Spectacular",  "Jl. Hayam Wuruk No. 1, Oro-oro Ombo, Kota Wisata Batu,  Jawa Timur 65316","http://wisatanesia.co/wp-content/uploads/2014/09/batu-night-spectacular.jpg"},
            {"Omah Kayu",               "Kelurahan Songgokerto, Kecamatan Batu, Kota Batu",                             "http://2.bp.blogspot.com/-b0bdABexULE/VTMilsC-3aI/AAAAAAAAC1E/XrMkNDIkBz4/s1600/DSC_0487-omah.jpg"},
            {"Wisata Paralayang Batu",       "Jl. Arumdalu 20 Songgoriti, Batu, Malang, Jawa Timur",                         "http://halomuda.com/wp-content/uploads/2016/06/Wisata-Paralayang.jpg"},
            {"Air Terjun Coban Rondo",             "Pandesari, Pujon, Malang, Jawa Timur ",                                        "http://3.bp.blogspot.com/-2PuG2MCdPVY/VhRpYrkt9_I/AAAAAAAACCo/GCm0S6VB1rE/s1600/Coban-Rondo-Malang.jpg"},
            {"Air Terjun Sumber Pitu",  "Desa Pujon Kidul, Pujon, Malang, Jawa Timur",                                  "http://piknikasik.com/wp-content/uploads/2015/11/wisata-alam-air-terjun-coban-sumber-pitu-malang-by-masgreg.jpg"},
            {"Pantai Balekambang",      "Dusun Sumber Jambe,Desa Srigonco,Kecamatan Bantur,Malang,Jawa Timur",          "https://hilsya.files.wordpress.com/2011/06/balekambang3.jpg"},
            {"Coban Nirwana",           "Gedangan, Kabupaten Malang Jawa Timur",                                         "http://www.anekawisata.com/wp-content/uploads/2016/06/Coban-Nirwana-Coban-Mbok-Karimah.jpg"},
            {"Pantai Batu Bengkung",    "Desa Gajah Rejo , Gedangan, Kabupaten Malang Jawa Timur",                       "https://cdns.klimg.com/newshub.id/news/2016/05/14/60175/270651-pantai-batu-bengkung.jpg"},
            {"Pantai Ngeliyep",         "Desa Kedungsalam, Donomulyo, Donomulyo, Malang, Jawa Timur",                      "http://tango.image-static.hipwee.com/wp-content/uploads/2014/12/pantai-ngliyep-malang-750x502.jpg"},
            {"Pulau Sempu",             "Pulau Sempu",                      "http://tango.image-static.hipwee.com/wp-content/uploads/2014/12/pulau-sempu-750x500.jpg"},
            {"Jatim Park 1",             "Kota Batu",                      "http://1.bp.blogspot.com/-t4ozLzUw5-8/VM2Kmdo0tDI/AAAAAAAAAGo/l0Xms_O3xNI/s1600/perbedaan-jatim-park-1-dan-jatim-park-2.jpg"},
            {"Jatim Park 2",             "Kota Batu",                      "http://www.naturalsunrisetour.com/wp-content/uploads/2015/10/3-wahana-wisata-andalan-jatim-park-2-batu.jpg"},
            {"Eco Green Park Malang",             "Kota Batu",                      "http://www.ecogreenpark.co.id/wp-content/uploads/2015/10/IMG_0983.jpg"},
            {"Coban Talun",             "Desa Tulungrejo, Kecamatan Bumi Aji, Kota Batu, Malang",                      "https://1.bp.blogspot.com/-6NxmeP4tT_E/VcAuHLzwD3I/AAAAAAAADIk/0mL5iam_yEo/s1600/Coban_Talun1.jpg"},
            {"Air panas Cangar Batu",             "Kota Batu",                      "http://www.malang-guidance.com/wp-content/uploads/2011/07/pemandian-air-panas-cangar.jpg"},
            {"Wendit Water Park",             "Desa Mangliawan Kecamatan Pakis, Kabupaten Malang ",                      "http://2.bp.blogspot.com/-PGelBevbxeg/VZ09RP1lgkI/AAAAAAAAENw/RiYCvqpCLgs/s1600/100_4884.JPG"},
            {"Pantai 3 Warna",             "Desa Sendang Biru, Kecamatan Sitiarjo, Kabupaten Malang, Jawa Timur",                      "https://3.bp.blogspot.com/-WblfZVAjIQA/VvTp-YvGBII/AAAAAAAAC1w/NU7iG4-sDrACLf8mLRfxTP-XdD04_MmEw/s1600/Pantai-Tiga-Warna-Malang.jpg"},
            {"Pantai Clungup",             "Malang",                      "https://cdns.klimg.com/newshub.id/news/2016/06/02/63520/291182-pantai-clungup.jpg"},
            {"Pantai Bolu-bolu",             "Malang",                      "http://iqbalazhari.com/wp-content/uploads/2016/05/42-tempat-wisata-malang-batu-dan-sekitarnya-terbaru-murah-33.jpg"},
            {"Pantai Lenggoksono",             " Dusun Lenggoksono, Desa Purwodadi, Tirtoyudo, Kabupaten Malang Jawa Timur. ",                      "http://iqbalazhari.com/wp-content/uploads/2016/05/42-tempat-wisata-malang-batu-dan-sekitarnya-terbaru-murah-35.jpg"},
            {"Pantai Bajul Mlati",             "Desa Gajahrejo Kecamatan Gedangan Malang Jawa Timur ",                      "http://static.initempatwisata.com/mediafiles/2015/11/Pantai-Bajul-Mati.jpg"},
            {"Pantai Kondang Merak",             " Desa Sumberbening Kecamatan Bantur Donomulyo Malang, Jawa Timur",                      "https://www.pegipegi.com/attraction/T00688/3591_T00688_ambarlila_files_wordpress_com_2015_03_sourceblogspot.jpg"},
            {"Pantai Jonggring Saloko",             " Desa Mentaraman Kecamatan Donomulyo Kabupaten Malang, Jawa Timur",                      "http://2.bp.blogspot.com/-t2Ny-4GyMhg/UPLU-FTRM_I/AAAAAAAAABA/Xjow0fb4Whk/s1600/100_2561.JPG"},
            {"Pantai Kondang Iwak",             " Malang",                      "http://iqbalazhari.com/wp-content/uploads/2016/05/42-tempat-wisata-malang-batu-dan-sekitarnya-terbaru-murah-39.jpg"},
            {"Air Terjun Coban Sewu",             "perbatasan Kecamatan Ampelgading Malang dan Kecamatan Pranowijo Lumajang",                      "http://iqbalazhari.com/wp-content/uploads/2016/05/42-tempat-wisata-malang-batu-dan-sekitarnya-terbaru-murah-42.jpg"},
            {"Pantai Goa Cina",             "Desa Sitiarjo Kecamatan Sumber Manjing Wetan Kabupaten Malang Jawa Timur",                      "http://iqbalazhari.com/wp-content/uploads/2016/05/42-tempat-wisata-malang-batu-dan-sekitarnya-terbaru-murah-41.jpg"},

            {"Pantai Sipelot",          "Pujiharjo, Tirtoyudo, Malang, Jawa Timur ",                                    "http://halomuda.com/wp-content/uploads/2016/06/Pantai-Sipelot.jpg"},
    };

    private ListView test;
    private ArrayList listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Malang City");
        test = (ListView)findViewById(R.id.lv_item);
        listItem = new ArrayList<>();

        MalangModel malang = null;

        for (int i = 0; i < data.length; i++){
            malang = new MalangModel();
            malang.setTitle(data[i][0]);
            malang.setSubtitle(data[i][1]);
            malang.setImage(data[i][2]);

            listItem.add(malang);
        }
        MalangAdapter adapter = new MalangAdapter(Malang.this, listItem);
        test.setAdapter(adapter);

        test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MalangModel mbl = (MalangModel) listItem.get(position);

                Intent intent = new Intent(Malang.this, DetailMalangActivity.class);
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