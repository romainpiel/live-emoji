package com.romainpiel.liveemoji;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

class EmojiAdapter extends RecyclerView.Adapter<EmojiViewHolder> {

    private final List<EmojiViewModel> items;
    private boolean animated;

    EmojiAdapter(List<EmojiViewModel> items) {
        this.items = items;
        this.animated = false;
    }

    void setAnimated(boolean animated) {
        this.animated = animated;
    }

    @Override
    public EmojiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_emoji, parent, false);
        return new EmojiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmojiViewHolder holder, int position) {
        holder.bind(items.get(position));
        holder.setAnimated(animated);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
