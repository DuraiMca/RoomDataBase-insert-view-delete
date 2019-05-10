package com.urban.admin.roomdatabase;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.urban.admin.roomdatabase.Fragment.AddFragment;
import com.urban.admin.roomdatabase.Fragment.DeleteFragment;
import com.urban.admin.roomdatabase.Fragment.ViewFragment;

public class MainActivity extends AppCompatActivity {
Button add,view,delete,update;

public static  myAppDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database= Room.databaseBuilder(this,myAppDatabase.class,"Userdb").allowMainThreadQueries().build();
       delete=findViewById(R.id.butdelete);
       delete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               DeleteFragment deleteFragment=new DeleteFragment();
               FragmentManager manager = getSupportFragmentManager();
               manager.beginTransaction().replace(R.id.MAINACTIVITY,deleteFragment,deleteFragment.getTag()).addToBackStack(null).commit();
           }
       });
        add=findViewById(R.id.butadd);
        view=findViewById(R.id.butview);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewFragment viewFragment=new ViewFragment();
                FragmentManager manager=getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.MAINACTIVITY,viewFragment,viewFragment.getTag()).commit();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddFragment addFragment=new AddFragment();
                FragmentManager manager=getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.MAINACTIVITY,addFragment,addFragment.getTag()).commit();
            }
        });



    }
}
