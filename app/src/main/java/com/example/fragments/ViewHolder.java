package com.example.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView tv;
    ImageView image;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tv= itemView.findViewById(R.id.nombreCompleto);
        image= itemView.findViewById(R.id.pfp);
    }


    public TextView getTv() {
        return tv;
    }

    public void setTv(TextView tv) {
        this.tv = tv;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
