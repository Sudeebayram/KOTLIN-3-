package com.example.uygulama12

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface NotesDao {
    @Query("SELECT * FROM notes")
    suspend fun getAllNotes(): List<NoteModel>

    @Insert
    suspend fun addNotes(noteModel: NoteModel)

    @Query("DELETE FROM notes WHERE id = :id")
    suspend fun deleteNotes(id: Int)

    @Query("SELECT * FROM notes WHERE id = :id")
    suspend fun getNotes(id: Int): NoteModel

    @Update
    suspend fun updateNotes(noteModel: NoteModel)



}