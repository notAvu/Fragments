package com.example.fragments;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import Clases.Contact;

public class ViewModelMain extends ViewModel {
   private MutableLiveData<ArrayList<Contact>> contactsList;


    private MutableLiveData<Contact> selectedContact;


    public ViewModelMain() {
        contactsList= new MutableLiveData<>();
        ArrayList<Contact>contacts = new ArrayList<>();
        contacts.add(new Contact("1Nombre", "1Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("2Nombre", "2Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("3Nombre", "3Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("Paqui", "laPaqui", "987555222", R.drawable.perfil));
        contacts.add(new Contact("5Nombre", "5Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("1Nombre", "1Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("2Nombre", "2Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("3Nombre", "3Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("4Nombre", "4Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("5Nombre", "5Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("1Nombre", "1Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("2Nombre", "2Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("3Nombre", "3Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("4Nombre", "4Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("5Nombre", "5Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("1Nombre", "1Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("2Nombre", "2Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("3Nombre", "3Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("4Nombre", "4Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("5Nombre", "5Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("1Nombre", "1Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("2Nombre", "2Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("3Nombre", "3Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("4Nombre", "4Provisional", "666555222", R.drawable.perfil));
        contacts.add(new Contact("5Nombre", "5Provisional", "666555222", R.drawable.perfil));
        contactsList.setValue(contacts);
    }

    public MutableLiveData<ArrayList<Contact>> getContactsList() {
        return contactsList;
    }

    public void setContactsList(MutableLiveData<ArrayList<Contact>> contactsList) {
        this.contactsList = contactsList;
    }
    public MutableLiveData<Contact> getSelectedContact() {
        return selectedContact;
    }

    public void setSelectedContact(MutableLiveData<Contact> selectedContact) {
        this.selectedContact = selectedContact;
    }
}
