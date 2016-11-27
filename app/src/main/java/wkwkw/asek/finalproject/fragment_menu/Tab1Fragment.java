package wkwkw.asek.finalproject.fragment_menu;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import wkwkw.asek.finalproject.R;
import wkwkw.asek.finalproject.fragment_pergi.Pergi;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {
    private Button btnClickMe11;

    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        btnClickMe11 = (Button)view.findViewById(R.id.btn_click_me1);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnClickMe11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Pergi.class);
                startActivity(intent);

            }
        });
    }

}
