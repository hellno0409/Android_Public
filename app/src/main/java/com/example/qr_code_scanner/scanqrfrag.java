package com.example.qr_code_scanner;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class scanqrfrag extends Fragment {

    TextView t;
    public scanqrfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_scanqrfrag, container, false);
         t=(TextView)view.findViewById(R.id.t);
        RatingBar ratingbar=(RatingBar)view.findViewById(R.id.ratingBar);
        int num=ratingbar.getNumStars();
        t.setText(num);

        return view;
    }

}
