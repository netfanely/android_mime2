package com.netfanely.mime2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Main3Activity extends AppCompatActivity {
    ImageView mivFotografia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mivFotografia = findViewById(R.id.ivFotografia);
        String ruta="https://i.pinimg.com/originals/db/9a/26/db9a26847ba1304e8babf7bef158b66b.jpg";
        Picasso.get().load(ruta).into(mivFotografia);
    }
}
