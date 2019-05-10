package com.urban.admin.roomdatabase.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.urban.admin.roomdatabase.MainActivity;
import com.urban.admin.roomdatabase.R;
import com.urban.admin.roomdatabase.User;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment extends Fragment {

TextView txt;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_view, container, false);
        txt=view.findViewById(R.id.textview);
        List<User> users= MainActivity.database.dao().getusers();
        String info="";
        for(User user:users) {
            String id= String.valueOf(user.getId());
            String name = user.getName();
            String age = user.getAge();
            String degree = user.getDegree();

            info = info + "\n\n" + "ID:"+id+"\n"+"Name:" +name+"\n"+"Age:"+age+"\n"+"Degree"+degree+"\n\n";
        }
        txt.setText(info);
        return view;
    }

}
