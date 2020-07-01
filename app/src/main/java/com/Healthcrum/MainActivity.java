package com.Healthcrum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
ImageView img;
LinearLayout main,header;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img= findViewById(R.id.image);
        main = findViewById(R.id.main);
        button = findViewById(R.id.button2);
        header = findViewById(R.id.header);

        Handler obj = new Handler();
        obj.postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setVisibility(View.GONE);
                main.setVisibility(View.VISIBLE);
                header.setVisibility(View.VISIBLE);
            }
        },2000);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.healthcrum.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
