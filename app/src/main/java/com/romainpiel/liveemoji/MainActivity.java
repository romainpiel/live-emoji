package com.romainpiel.liveemoji;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView u1f603 = (ImageView) findViewById(R.id.u1f603);
        ImageView u263a = (ImageView) findViewById(R.id.u263a);
        ImageView u1f635 = (ImageView) findViewById(R.id.u1f635);
        ImageView u1f60e = (ImageView) findViewById(R.id.u1f60e);
        animate(u1f603, u263a, u1f635, u1f60e);
    }

    private void animate(ImageView... imageViews) {
        for (ImageView imageView : imageViews) {
            AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) imageView.getDrawable();
            drawable.start();
        }
    }
}
