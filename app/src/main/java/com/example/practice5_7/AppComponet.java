package com.example.practice5_7;

import android.content.Context;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponet {
    Context getContext();
}
