package com.example.fragments;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import Clases.Contact;

public class ViewModelMain extends ViewModel {
   private MutableLiveData<ArrayList<Contact>> contactsList;

    public ViewModelMain() {
        ArrayList<Contact>contacts = new ArrayList<>();
        contacts.add(new Contact("1Nombre", "Provisional", "666555222", 12));
        contacts.add(new Contact("2Nombre", "Provisional", "666555222", 12));
        contacts.add(new Contact("3Nombre", "Provisional", "666555222", 12));
        contacts.add(new Contact("4Nombre", "Provisional", "666555222", 12));
        contacts.add(new Contact("5Nombre", "Provisional", "666555222", 12));
        contactsList.postValue(contacts);
    }
}
