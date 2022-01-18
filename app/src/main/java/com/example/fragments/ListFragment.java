package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Clases.Contact;

public class ListFragment extends Fragment {
    ViewModelMain vm ;
    RecyclerView recyclerContacts;
    ArrayList<Contact> contacts;

    public ListFragment()
    {
        super(R.layout.fragment_list);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contacts= new ArrayList<>();
        contacts.add(new Contact("1Nombre", "1Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("2Nombre", "2Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("3Nombre", "3Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("Paqui", "laPaqui", "987555222", R.drawable.perfil));
        contacts.add(new Contact("5Nombre", "5Provisional", "666555222", R.drawable.perfil));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View infl= inflater.inflate(R.layout.fragment_list, container, false);
        recyclerContacts = infl.findViewById(R.id.contacts);
        recyclerContacts.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerContacts.setAdapter(new MyAdapter(contacts));
        return infl;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm= new ViewModelProvider(requireActivity()).get(ViewModelMain.class);
        recyclerContacts.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), recyclerContacts,new OnItemClickListener() {
            public void onItemClick(View view, int position) {
                vm.getSelectedContact().setValue(contacts.get(position));

            }
            public void onLongItemClick(View view, int position) {}
        }));
    }
}