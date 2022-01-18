package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import Clases.Contact;

public class DetailsFragment extends Fragment {
    ImageView profilePic;
    TextView nameSurname;
    TextView phone;
    ViewModelMain vm;
    public DetailsFragment()
    {
        super();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm= new ViewModelProvider(requireActivity()).get(ViewModelMain.class);

        vm.getSelectedContact().observe(this, this::OnSelectionChanged);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View infla= inflater.inflate(R.layout.details_fragment, container, false);
        profilePic=infla.findViewById(R.id.profile_pic);
        nameSurname= infla.findViewById(R.id.profile_name);
        phone=infla.findViewById(R.id.telephone_number);
        return infla;
    }

    private void OnSelectionChanged(Contact selectedContact) {
        if(selectedContact!=null) {
            profilePic.setImageResource(selectedContact.getImgSource());
            nameSurname.setText(String.format("%s %s", selectedContact.getName(), selectedContact.getSurname()));
            phone.setText(selectedContact.getTlfn());
        }else
            {
                profilePic.setImageResource(R.drawable.perfil);
                nameSurname.setText("");
                phone.setText("");
            }

    }
}
