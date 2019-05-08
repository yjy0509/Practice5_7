package com.example.practice5_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.practice5_7.R;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DaggerUserComponet.create()
                .inject(this);
    }

    public void click(View view) {
        if (view.getId() == R.id.login){
            apiService.login();
        }else if (view.getId() == R.id.register){
            apiService.register();
        }
    }
}
