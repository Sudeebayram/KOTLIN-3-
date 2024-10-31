package com.example.uygulama12

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NoteModel::class], version = 1, exportSchema = false)
abstract class NotesDbase : RoomDatabase() {

    abstract fun notesDao(): NotesDao
}