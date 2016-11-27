package wkwkw.asek.finalproject.Yogyakarta;

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

public class Yogyakarta extends AppCompatActivity {
    String[][] data = new String[][]{
            {"Pantai Parangtritis", "Jl. Parangtritis Km. 28 Parangtritis Yogyakarta INDONESIA 55188",                                  "http://static.initempatwisata.com/mediafiles/2016/11/Bermain-ATV-di-Pantai-Parangtritis.jpg"},
            {"Pantai Sadeng", "Songbanyu, Girisubo, Gunung Kidul Regency, Yogyakarta",                                                  "http://static.initempatwisata.com/mediafiles/2016/11/Potret-suasana-di-Pantai-Sadeng-Jogja.jpg"},
            {"Goa Pindul", "Gelaran 2, Bejiharjo, Karangmojo, Gunungkidul, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta ",         "http://goapindulgelaran.com/wp-content/uploads/2016/05/Cave-Tubing-Goa-Pindul-Gunungkidul-1.jpg"},
            {"Bukit Parangndog", "Bukit Paralayang, Purwosari, Girijati, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta ","http://1.bp.blogspot.com/-jGBaTyF1hNc/VNW14xyvnPI/AAAAAAAAA6A/7qv1ZPaZQp4/s1600/DSCN5581_2_wm.jpg"},
            {"Pantai Timang", "Tepus, Jl. Pantai Sel. Jawa, Tepus, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta",                   "http://duniatraveling.co.id/wp-content/uploads/2014/08/pantai-timang.jpg"},
            {"Pantai Kukup", "Kemadang, Yogyakarta, Gunung Kidul Regency, Yogyakarta",                                                     "https://4.bp.blogspot.com/-qPROw6KHcWE/UXmZhsb9jDI/AAAAAAAAAPs/cSuz68xSFm8/s1600/kukup.jpg"},
            {"Candi Sambisari ", " Purwomartani, Kalasan, Sleman, Yogyakarta",                                                              "https://winning444.files.wordpress.com/2016/03/candi_sambisari_2013-11-14_03.jpg?w=768"},
            {"Bukit Bintang Yogyakarta ", "Patuk, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta ",                                     "https://www.pegipegi.com/attraction/T01078/9515_T01078_www_telusurindonesia_com_wpcontent_uploads_2015_02_bukitbintangjogja1.jpg"},


            {"Malioboro", "Jalan Malioboro, Yogyakarta 55122, Indonesia",                                                                   "http://www.yogya-backpacker.com/wp-content/uploads/2015/06/Malioboro_3.jpg"},
            {"Jogja Bay Pirates", "Sebelah Utara Stadion Maguwoharjo, Kabupaten Slemen, DIY",                                                   "https://fromasiawithlife.files.wordpress.com/2015/12/img_3908.jpg"},
            {"Green Village", "Dusun Guyangan Lor, Mertelu, Kabupaten Gunungkidul, DIY",                                                        "https://2.bp.blogspot.com/-wFZXZuvRMng/VqSy1oN3FiI/AAAAAAAAARI/pbbl3JE8VB8/s1600/Screenshot%2Bfrom%2B2016-01-24%2B17%253A41%253A38.png"},
            {"Telaga Biru Gunung Kidul", "Dusun Ngemplak Desa Candirejo Kecamatan Semin Gunung Kidul",                                              "http://www.dutawisata.co.id/wp-content/uploads/2016/02/telaga-biru-semin-gunung-kidul.jpg"},
            {"Puncak Kosakora", "Desa Ngestirejo, Kecamatan Tanjungsari, Gunungkidul, Yogyakarta",                                              "http://www.telusurindonesia.com/wp-content/uploads/2015/08/puncak-kosakora-gunungkidul-1.jpg"},
            {"Upside Down World Jogja", "Jalan Ring Road Utara, Maguwoharjo, Kec. Depok, Kabupaten Sleman, DIY",                                      "http://www.anekawisata.com/wp-content/uploads/2015/12/Upside-Down-World-Jogja.jpg"},
            {"Taman Sari", "Jl. Taman, Kraton, Yogyakarta 55133, Indonesia ",                                                           "http://anekatempatwisata.com/wp-content/uploads/2014/10/Istana-Air-Taman-Sari-Jogja-2.jpg"},
            {"Gembiraloka Zoo", "Jl. Kebun Raya No. 2, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55171",                              "http://static.initempatwisata.com/mediafiles/2016/11/Suasana-dalam-Gembira-Loka-Zoo.jpg"},
            {"Kid Fun Jogja", "Jalan Wonosari KM. 10 Yogyakarta",                                                                   "https://irs2.4sqi.net/img/general/300x280/4992251_D8eCZbek7g_7siSdTzMd-yXy4zN77VCu5Edg2oVcKjc.jpg"},
            {"Pantai Siung", "Jl. Pantai Siung, Tepus, Gunungkidul, Daerah Istimewa Yogyakarta" ,                                       "http://static.initempatwisata.com/mediafiles/2016/11/Pantai-Siung-di-Gunung-Kidul-Yogyakarta.jpg"},
            {"Pantai Ngerenehan", "Desa Kanigoro Kecamatan Saptosari Kabupaten Gunungkidul Yogyakarta",                                     "http://static.initempatwisata.com/mediafiles/2016/11/Pantai-Ngerenehan.jpg"},
            {"Candi Ratu Boko", "Jalan Solo kilometer 17, Desa Bokoharjo, Kecamatan Prambanan, Kabupaten Sleman",                   "http://www.yogya-backpacker.com/wp-content/uploads/2015/06/Ratuboko_1.jpg"},
            {"Kraton Yogyakarta", "Jl. Rotowijayan Blok No. 1, Panembahan, Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta",            "https://upload.wikimedia.org/wikipedia/commons/3/33/Kraton_Yogyakarta_Pagelaran.jpg"},
            {"Pantai Sadranan", "Dusun Pulegundes II, Desa Sidoarjo, Kec. Tepus, Gunung Kidul, Daerah Istimewa Yogyakarta",                 "http://static.initempatwisata.com/mediafiles/2016/11/Pantai-Sadranan-di-Gunung-Kidul-Jogja.jpg"},
            {"Taman Pintar", "Jalan Panembahan Senopati No. 1-3, Gondomanan, Daerah Istimewa Yogyakarta",                                   "http://static.initempatwisata.com/mediafiles/2016/11/Taman-Pintar-Yogyakarta.jpg"},
            {"Candi Prambanan", "Bokoharjo, Prambanan, Sleman Regency, Special Region of Yogyakarta",                               "http://static.initempatwisata.com/mediafiles/2016/11/Candi-Prambanan-di-malam-hari.jpg"},
            {"Pantai Wediombo", "Jepitu, Girisubo, Gunung Kidul Regency, Special Region of Yogyakarta",                             "http://indonesiawow.com/wp-content/uploads/2014/03/alamat-pantai-wediombo.jpg"},
            {"Pantai Glagah", "Temon, Wates, Kulon Progo, Yogyakarta",                                                              "http://static.initempatwisata.com/mediafiles/2016/11/Memancing-kala-senja-di-Pantai-Glagah.jpg"},
            {"Benteng Vredeburg", "Jl. Ahmad Yani No.6, Ngupasan, Gondomanan, Kota Yogyakarta, Daerah Istimewa Yogyakarta",             "http://static.initempatwisata.com/mediafiles/2016/11/Museum-Benteng-Vredeburg-Jogjakarta.jpg"},
            {"Pantai Baron", "Kemadang, Tanjungsari, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta 55881",                         "http://static.initempatwisata.com/mediafiles/2016/11/Pantai-Baron-Jogja.jpg"},

            {"Gumuk Pasir Parangkusumo", "Jalan Pantai Parangkusumo, Parangtritis, Kec. Kretek, Bantul, Daerah Istimewa Yogyakarta",            "https://4.bp.blogspot.com/-kt6H8Ult8RQ/Vm_kUTdvijI/AAAAAAAABPM/AitQNPoBXig/s1600/sunrise%2Bdi%2Bgumuk%2Bpasir%2Bparangkusumo.jpg"}


    };

    private ListView lvItem;
    private ArrayList listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malang);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Yogyakarta City");
        lvItem = (ListView)findViewById(R.id.lv_item);
        listItem = new ArrayList<>();

        YogyakartaModel mobil = null;

        for (int i = 0; i < data.length; i++){
            mobil = new YogyakartaModel();
            mobil.setTitle(data[i][0]);
            mobil.setSubtitle(data[i][1]);
            mobil.setImage(data[i][2]);

            listItem.add(mobil);
        }

        YogyakartaAdapter adapter = new YogyakartaAdapter(Yogyakarta.this, listItem);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                YogyakartaModel mbl = (YogyakartaModel) listItem.get(position);

                Intent intent = new Intent(Yogyakarta.this, DetailYogyakartaActivity.class);
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