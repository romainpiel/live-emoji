package com.romainpiel.liveemoji;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EmojiAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<EmojiViewModel> items = new ArrayList<>();
        items.add(new EmojiViewModel(R.drawable.animated_emoji_u1f603));
        items.add(new EmojiViewModel(R.drawable.animated_emoji_u263a));
        items.add(new EmojiViewModel(R.drawable.animated_emoji_u1f635));
        items.add(new EmojiViewModel(R.drawable.animated_emoji_u1f613));
        items.add(new EmojiViewModel(R.drawable.animated_emoji_u1f60e));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

        adapter = new EmojiAdapter(items);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.setAnimated(true);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onStop() {
        adapter.setAnimated(false);
        adapter.notifyDataSetChanged();
        super.onStop();
    }
}