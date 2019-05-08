package com.example.practice5_8;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    public UserModule(){
    }

    @Provides
    ApiService providesApiService(){
        return new ApiService();
    }

}
