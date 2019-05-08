package com.example.practice5_8;


import dagger.Component;

@Component(modules = {UserModule.class})
public interface UserComponet {
    void inject(Main2Activity activity);
}
