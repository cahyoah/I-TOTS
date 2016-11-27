package wkwkw.asek.finalproject.fragment_pergi;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import wkwkw.asek.finalproject.R;
/**
 * A simple {@link Fragment} subclass.
 */
public class Pergi_3 extends Fragment {

    private  FloatingActionButton btnSecond;
    public Pergi_3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pergi_3, container, false);
        btnSecond = (FloatingActionButton) view.findViewById(R.id.floatingActionButton);

        ((Pergi)getActivity()).getSupportActionBar().setTitle("Tips Berlibur 3");
        ((Pergi)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((Pergi)getActivity()).getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().
                        setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                        replace(R.id.frame_container,
                                new Pergi_4(),
                                Pergi_4.class.getSimpleName())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }

        return super.onOptionsItemSelected(item);
    }
}
