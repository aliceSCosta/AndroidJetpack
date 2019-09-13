package com.example.androidjetpack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.androidjetpack.ui.start.StartFragment;
import com.example.androidjetpack.ui.start.StartViewModel;

public class StartActivity extends AppCompatActivity {

    public StartViewModel mViewModel;
    public TextView appleNumber;
    public Button appleBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        mViewModel = ViewModelProviders.of(this).get(StartViewModel.class);
        appleNumber = findViewById(R.id.apple_number);

        appleBt = findViewById(R.id.bt_apple);
        appleBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void showApple(){
        int apple = mViewModel.getApple();
        String qtdApple = String.valueOf(apple);
        appleNumber.setText(qtdApple);

    }

    public void increaseApple(View v){
        mViewModel.increaseAppleCounter();
        showApple();
    }

    public void onResume(){
        super.onResume();
        showApple();
    }
}
