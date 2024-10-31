package com.example.uygulama12

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteModel (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0 ,
    val note : String,
    val noteTitle : String



) {

}