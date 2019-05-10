package com.urban.admin.roomdatabase.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.urban.admin.roomdatabase.MainActivity;
import com.urban.admin.roomdatabase.R;
import com.urban.admin.roomdatabase.User;


public class AddFragment extends Fragment {


EditText name,age,degree;
Button save;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_add, container, false);
       name=view.findViewById(R.id.name);
       age=view.findViewById(R.id.age);
       degree=view.findViewById(R.id.degree);
       save=view.findViewById(R.id.save);
       save.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               User user=new User(name.getText().toString(),age.getText().toString(),degree.getText().toString());
               MainActivity.database.dao().adduser(user);
               Toast.makeText(getContext(), "Added Successfully", Toast.LENGTH_SHORT).show();
               name.setText("");
               age.setText("");
               degree.setText("");

           }
       });




       return  view;
    }

}
