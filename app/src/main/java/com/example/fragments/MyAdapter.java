package com.example.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Clases.Contact;

class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<Contact> listado;

    public MyAdapter(ArrayList<Contact> list) {
        listado = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact si = listado.get(position);
        holder.getTv().setText((si.getName() + " " + si.getSurname()));
        holder.getImage().setImageResource(si.getImgSource());
    }

    @Override
    public int getItemCount() {
        return listado.toArray().length;
    }
}
