package wkwkw.asek.finalproject.fragment_pulang;


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
public class Pulang_5 extends Fragment {

    private FloatingActionButton button;
    public Pulang_5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pulang_5, container, false);
        button = (FloatingActionButton) view.findViewById(R.id.floatingActionButton);
        ((Pulang)getActivity()).getSupportActionBar().setTitle("Tips 5");
        ((Pulang)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setHasOptionsMenu(true);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().
                        setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                        replace(R.id.frame_container,
                                new Pulang_6(),
                                Pulang_6.class.getSimpleName())
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