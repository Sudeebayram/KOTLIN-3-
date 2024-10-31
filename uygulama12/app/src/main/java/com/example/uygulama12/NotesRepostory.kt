package com.example.uygulama12

import javax.inject.Inject

class NotesRepostory @Inject constructor(private val notesDao: NotesDao) {
    suspend fun getAllNotes(): List<NoteModel> = notesDao.getAllNotes()

    suspend fun addNotes(noteModel: NoteModel) {
        notesDao.addNotes(noteModel)

    }

    suspend fun deleteNotes(id: Int) {
        notesDao.deleteNotes(id)
    }

    suspend fun getNotes(id: Int): NoteModel = notesDao.getNotes(id)

    suspend fun updateNotes(noteModel: NoteModel) {
        notesDao.updateNotes(noteModel)
    }





}