package wkwkw.asek.finalproject.fragment_pulang;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import wkwkw.asek.finalproject.Main2Activity;
import wkwkw.asek.finalproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Pulang_1 extends Fragment {


    private FloatingActionButton btnFirstFragment;

    public Pulang_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_pulang_1, container, false);
        btnFirstFragment = (FloatingActionButton) view.findViewById(R.id.floatingActionButton);

        ((Pulang)getActivity()).getSupportActionBar().setTitle("Tips 1");
        ((Pulang)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((Pulang)getActivity()).getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().
                        setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                        replace(R.id.frame_container,
                                new Pulang_2(),
                                Pulang_2.class.getSimpleName())
                        .addToBackStack(null).commit();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            Intent intent = new Intent(getActivity(), Main2Activity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
