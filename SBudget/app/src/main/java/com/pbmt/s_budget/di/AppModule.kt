package com.pbmt.s_budget.di

import android.app.Application
import com.pbmt.s_budget.data.local.AppDatabase
import com.pbmt.s_budget.data.local.datastore.UIModeDataStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@InstallIn(ActivityComponent::class)

@Module

class AppModule {



    @Singleton

    @Provides

    fun providePreferenceManager(application: Application): UIModeDataStore {

        return UIModeDataStore(application.applicationContext)

    }



    @Singleton

    @Provides

    fun provideNoteDatabase(application: Application): AppDatabase {

        return AppDatabase.invoke(application.applicationContext)

    }

}