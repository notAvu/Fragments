package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {
    public DetailsFragment()
    {
        super();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View infla= inflater.inflate(R.layout.details_fragment, container, false);

        return infla;
    }
}
