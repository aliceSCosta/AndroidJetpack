package com.example.androidjetpack.ui.start;

import androidx.lifecycle.ViewModel;

public class StartViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private int apple = 0;

    public int getApple() {
        return apple;
    }

    public void setApple(int apple) {
        this.apple = apple;
    }

    public void increaseAppleCounter(){
        ++apple;
    }
}
