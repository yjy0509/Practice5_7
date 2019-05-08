package com.example.practice5_7;

import android.content.Context;
import android.util.Log;


public class Person {

    private Context context;

    private String name;

    public Person(Context context){
        Log.v("yjy","a person is created by " + context);
    }

    public Person(String name){
        this.name = name;
        Log.v("yjy","a person is created with name : " + name);
    }
}
