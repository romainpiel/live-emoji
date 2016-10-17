package com.romainpiel.liveemoji;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ViewGroup container;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (ViewGroup) findViewById(R.id.container);
    }

    @Override
    protected void onStart() {
        super.onStart();
        for (int i = 0; i < container.getChildCount(); i++) {
            ImageView imageView = (ImageView) container.getChildAt(i);
            AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) imageView.getDrawable();
            drawable.start();
        }
    }

    @Override
    protected void onStop() {
        for (int i = 0; i < container.getChildCount(); i++) {
            ImageView imageView = (ImageView) container.getChildAt(i);
            AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) imageView.getDrawable();
            drawable.stop();
        }
        super.onStop();
    }
}