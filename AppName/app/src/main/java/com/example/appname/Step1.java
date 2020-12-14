package com.example.appname;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Step1 extends AppCompatActivity {
    ConstraintLayout weight_loss;
    ImageView bg_weight;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_1);


    }

    public void weightClick(View view) {
        bg_weight = findViewById(R.id.bg_weight);
        bg_weight.setImageResource(R.drawable.btn_active);
        Intent intent = new Intent(Step1.this, Step2.class);
        startActivity(intent);
    }
}
