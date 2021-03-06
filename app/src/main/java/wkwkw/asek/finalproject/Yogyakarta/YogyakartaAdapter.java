package wkwkw.asek.finalproject.Yogyakarta;

/**
 * Created by ASUS on 19/11/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import wkwkw.asek.finalproject.R;

public class YogyakartaAdapter extends BaseAdapter {
    // params
    ArrayList listItem;
    Activity activity;

    public YogyakartaAdapter(Activity activity, ArrayList listItem){
        this.activity = activity;
        this.listItem = listItem;
    }

    //method ini akan menentukan seberapa banyak data yang akan ditampilkan didalam ListView
    //listItem.size() == jumlah data dalam object List yang ada
    @Override
    public int getCount() {
        return listItem.size();
    }

    //method ini untuk mengakses per-item objek dalam list
    @Override
    public Object getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //method ini yang akan menampilkan baris per baris dari item yang ada di ListView
    //dengan menggunakan pattern ViewHolder untuk optimasi performa dari ListView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = null;

        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.yogyakarta_list, null);
            holder.txtSubtitle = (TextView)view.findViewById(R.id.txt_item_subtitle);
            holder.txtTitle = (TextView)view.findViewById(R.id.txt_item_title);
            holder.imgItem = (ImageView) view.findViewById(R.id.gambar);

            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }

        YogyakartaModel color = (YogyakartaModel) getItem(position);
        holder.txtTitle.setText(color.getTitle());
        holder.txtSubtitle.setText(color.getSubtitle());
        Picasso.with(activity).load(color.getImage()).into(holder.imgItem);
        return view;
    }

    static class ViewHolder{
        ImageView imgItem;
        TextView txtTitle, txtSubtitle;
    }
}