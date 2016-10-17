package com.romainpiel.liveemoji;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

class EmojiViewHolder extends RecyclerView.ViewHolder {

    private final ImageView imageView;

    EmojiViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.emoji);
    }

    void bind(EmojiViewModel viewModel) {
        imageView.setImageResource(viewModel.getDrawableRes());
    }

    void setAnimated(boolean animated) {
        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) imageView.getDrawable();
        if (drawable == null) {
            return;
        }
        if (animated) {
            drawable.start();
        } else {
            drawable.stop();
        }
    }
}
