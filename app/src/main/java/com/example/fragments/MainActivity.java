package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Clases.Contact;

public class MainActivity extends AppCompatActivity {
    ViewModelMain vm ;
    RecyclerView contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vm = new ViewModelMain();
        contacts= findViewById(R.id.contacts);
        contacts.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        contacts.setAdapter(new MyAdapter(vm.getContactsList().getValue()));
        contacts.addOnItemTouchListener(new RecyclerItemClickListener(this, contacts ,new OnItemClickListener() {
            public void onItemClick(View view, int position) {
                Toast t= Toast.makeText(view.getContext(), vm.getContactsList().getValue().get(position).getName(), Toast.LENGTH_SHORT);
                t.show();
            }

            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}
class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<Contact> listado;
    public MyAdapter(ArrayList<Contact> list)
    {
        listado=list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact si=listado.get(position);
        holder.getTv().setText((si.getName()+" "+si.getSurname()));
        holder.getImage().setImageResource(si.getImgSource());

    }

    @Override
    public int getItemCount() {
        return listado.toArray().length;
    }
}

