package com.urban.admin.roomdatabase.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.urban.admin.roomdatabase.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Update extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view=inflater.inflate(R.layout.fragment_update, container, false);
       return view;
    }

}
