package com.example.uygulama12

import android.content.Context
import androidx.room.ProvidedAutoMigrationSpec
import androidx.room.Room
import androidx.test.espresso.core.internal.deps.dagger.Module
import androidx.test.espresso.core.internal.deps.dagger.Provides
import com.example.uygulama12.Constants.Companion.BASE_URL
//import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.auth
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.ktx.auth



@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFirebaseAuth(): FirebaseAuth = Firebase.auth


    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient{
        return OkHttpClient.Builder().build()

    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()

    }

    @Provides
    @Singleton
    fun provideApiServices(retrofit: Retrofit): ApiServices{
        return retrofit.create(ApiServices::class.java)

    }

    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext context: Context): NotesDbase {
        return Room.databaseBuilder(context, NotesDbase::class.java, "notes_db").fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun provideNotesDao(notesDbase: NotesDbase): NotesDao {
        return notesDbase.notesDao()
    }

}