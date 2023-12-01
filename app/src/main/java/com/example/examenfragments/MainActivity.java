package com.example.examenfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BlankFragmentEntrenos entreno1;
    BlankFragmentEntreno2 entreno2;
    BlankFragmentEntreno3 entreno3;
    BlankFragmentEntreno4 entreno4;


    ArrayList<Entrenos> fragmentsEntrenos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentsEntrenos = new ArrayList<Entrenos>();
        fragmentsEntrenos.add(new Entrenos("Entreno1"));
        fragmentsEntrenos.add(new Entrenos("Entreno2"));
        fragmentsEntrenos.add(new Entrenos("Entreno3"));
        fragmentsEntrenos.add(new Entrenos("Entreno4"));


        MainActivity.Adaptadorr adaptador = new Adaptadorr(this);


       // @SuppressLint("MissingInflatedId") ListView lista = findViewById(R.id.listae);
        //lista.setAdapter(adaptador);


    }
        class Adaptadorr extends ArrayAdapter<Entrenos> {

            AppCompatActivity appCompatActivity;

            Adaptadorr(AppCompatActivity context) {
                super(context, R.layout.fragment_blank_entrenos, fragmentsEntrenos);
                appCompatActivity = context;
            }


            public View getView(int position, View convertView, ViewGroup parent) {
                LayoutInflater inflater = appCompatActivity.getLayoutInflater();
                View item = inflater.inflate(R.layout.fragment_blank_entrenos, null);

                TextView textView1 = item.findViewById(R.id.textView1);
                textView1.setText(fragmentsEntrenos.get(position).getNombre());

                ImageView imageView1 = item.findViewById(R.id.imageView1);

                return item;
            }
        }
    }




