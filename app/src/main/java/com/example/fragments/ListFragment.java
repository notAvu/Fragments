package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class ListFragment extends Fragment {
    ViewModelMain vm ;
    RecyclerView contacts;
    public ListFragment()
    {
        super(R.layout.fragment_list);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View infl= inflater.inflate(R.layout.fragment_list, container, false);
        vm = new ViewModelMain();
        contacts= infl.findViewById(R.id.contacts);
        contacts.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        contacts.setAdapter(new MyAdapter(vm.getContactsList().getValue()));
        contacts.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), contacts ,new OnItemClickListener() {
            public void onItemClick(View view, int position) {
                Toast t= Toast.makeText(view.getContext(), vm.getContactsList().getValue().get(position).getName(), Toast.LENGTH_SHORT);
                t.show();
            }
            public void onLongItemClick(View view, int position) {}
        }));
        return infl;
    }
}