package com.example.practice5_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @PersonWithContext
    @Inject
    Person person;
    @PersonWithName
    @Inject
    Person person1;
    @Inject
    People people;

    /**
     *
     * Android 无敌
     * Android 一般
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AppComponet appComponet = DaggerAppComponet.builder()
                .appModule(new AppModule(this))
                .build();

        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .appComponet(appComponet)
                .activityModule(new ActivityModule())
                .build();
        activityComponent.inject(this);

    }
}
