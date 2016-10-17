package com.romainpiel.liveemoji;

import android.support.annotation.DrawableRes;

class EmojiViewModel {
    @DrawableRes
    private final int drawableRes;

    EmojiViewModel(@DrawableRes int drawableRes) {
        this.drawableRes = drawableRes;
    }

    @DrawableRes
    int getDrawableRes() {
        return drawableRes;
    }
}
