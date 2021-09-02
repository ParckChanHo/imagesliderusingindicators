package com.example.imagesliderusingindicators;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemChangeListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.denzcoskun.imageslider.constants.ScaleTypes; // important
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = (ImageSlider)findViewById(R.id.slider);
        ArrayList<SlideModel> images = new ArrayList<>();
        images.add(new SlideModel(R.drawable.dog1, "image1", ScaleTypes.FIT)); // you can with title
        images.add(new SlideModel(R.drawable.dog2, "image2", ScaleTypes.FIT)); // you can with title
        images.add(new SlideModel(R.drawable.dog3, "image3", ScaleTypes.FIT)); // you can with title
        images.add(new SlideModel(R.drawable.dog4, "image4", ScaleTypes.FIT)); // you can with title
        imageSlider.setImageList(images,ScaleTypes.FIT); // for all images

        imageSlider.setItemChangeListener(new ItemChangeListener() {
            @Override
            public void onItemChanged(int i) {
                if(i==0){
                    String url = "https://meditationwiki.net/wiki/%EB%AA%85%EC%83%81_%ED%9A%A8%EA%B3%BC";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                }
            }
        });
    }


}
