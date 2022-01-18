package com.example.fragments;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.Serializable;
import java.util.ArrayList;

import Clases.Contact;

public class ViewModelMain extends ViewModel implements Serializable {
    private MutableLiveData<Contact> selectedContact;


    private MutableLiveData<String> state;

    public ViewModelMain() {
        selectedContact= new MutableLiveData<>();
        state=new MutableLiveData<>();
    }

    public MutableLiveData<String> getState() { return state; }
    public MutableLiveData<Contact> getSelectedContact() { return selectedContact; }


}
