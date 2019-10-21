package com.example.androidclass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Imageviewer extends AppCompatActivity {
    Button btn;
    ImageView img1, img2, img3, img4;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageviewer);

        btn = findViewById(R.id.btn);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;

                if(i == 1){

                    img1.setImageResource(R.drawable.bear);
                    img4.setImageResource(R.drawable.ic_launcher_background);
                }

                else if(i==2){
                 img2.setImageResource(R.drawable.bird);
                 img1.setImageResource(R.drawable.ic_launcher_background);
                }

                else if (i==3){
                    img3.setImageResource(R.drawable.cheetah);
                    img2.setImageResource(R.drawable.ic_launcher_background);
                }

                else if (i==4){
                    img4.setImageResource(R.drawable.tiger);
                    img3.setImageResource(R.drawable.ic_launcher_background);
                    i=0;
                }
            }
        });
    }


}
