package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//            vm= (ViewModelMain) savedInstanceState.getSerializable("viewModel");

        vm = (ViewModelMain) this.getArguments().getSerializable("viewModel");
        View infla= inflater.inflate(R.layout.details_fragment, container, false);
        profilePic=infla.findViewById(R.id.profile_pic);
        nameSurname= infla.findViewById(R.id.profile_name);
        phone=infla.findViewById(R.id.telephone_number);
        Contact selectedContact= vm.getSelectedContact().getValue();
        if(selectedContact!=null) {
            profilePic.setImageResource(selectedContact.getImgSource());
            nameSurname.setText(selectedContact.getName() + " " + selectedContact.getSurname());
            phone.setText(selectedContact.getTlfn());
        }else
            {
                profilePic.setImageResource(R.drawable.perfil);
                nameSurname.setText("");
                phone.setText("000000000");
            }
        return infla;
    }
}
