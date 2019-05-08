package com.example.practice5_7;

import dagger.Component;

@Component(dependencies = {AppComponet.class},modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
