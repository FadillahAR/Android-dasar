package com.dicoding.galaksi;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Details extends AppCompatActivity {
    public static final String name ="name";
    public static final String detail ="detail";
    public static final String photo ="photo";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imgPhoto = findViewById(R.id.img_item_photo);
        TextView tvNameData= findViewById((R.id.tv_item_name));
        TextView tvDetailData= findViewById(R.id.tv_item_detail);

        String getName = getIntent().getStringExtra(name);
        String getDetail = getIntent().getStringExtra(detail);
        int getPhoto = getIntent().getIntExtra(photo,0);

        String text = getName;
        tvNameData.setText(text);

        String detail =getDetail;
        tvDetailData.setText(detail);

        Glide.with(this)
                .load(getPhoto)
                .apply(new RequestOptions().override(300,300))
                .into(  imgPhoto);
    }
}
