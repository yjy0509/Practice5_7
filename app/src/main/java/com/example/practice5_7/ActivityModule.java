package com.example.practice5_7;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    @PersonWithContext
    @Provides
    Person providesPersonWithContext(Context context){
        return new Person(context);
    }

    @PersonWithName
    @Provides
    Person providesPersonWithName(){
        return new Person("yjy");
    }


    @Provides
    People providesPeople(Context context){
        return new People(context);
    }
}
