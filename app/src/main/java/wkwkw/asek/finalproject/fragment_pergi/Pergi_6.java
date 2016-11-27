package wkwkw.asek.finalproject.fragment_pergi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import wkwkw.asek.finalproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pergi_6 extends Fragment {


    public Pergi_6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pergi_6, container, false);

        ((Pergi)getActivity()).getSupportActionBar().setTitle("Tips Berlibur 6");
        ((Pergi)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((Pergi)getActivity()).getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
        return view;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }

}
