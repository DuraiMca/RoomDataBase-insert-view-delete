package com.urban.admin.roomdatabase.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.urban.admin.roomdatabase.Fragment.ViewFragment;
import com.urban.admin.roomdatabase.MainActivity;
import com.urban.admin.roomdatabase.R;
import com.urban.admin.roomdatabase.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteFragment extends Fragment {

EditText editText;
Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_delete, container, false);
        editText=view.findViewById(R.id.id);
        button=view.findViewById(R.id.delete);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user=new User("","","");
                user.setId (Integer.parseInt(editText.getText().toString()));
                MainActivity.database.dao().deleteuser(user);
                Toast.makeText(getContext(), "Deleted", Toast.LENGTH_SHORT).show();

                ViewFragment viewFragment=new ViewFragment();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.MAINACTIVITY,viewFragment,viewFragment.getTag()).commit();
            }
        });
        return view;
    }

}
