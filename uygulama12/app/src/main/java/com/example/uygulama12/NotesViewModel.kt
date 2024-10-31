package com.example.uygulama12

import android.telecom.Call.Details
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class NotesViewModel @Inject constructor(
    private val getNotesUseCase: GetNotesUseCase ,
    private val addNoteUseCase: AddNoteUseCase ,
    private val deleteNoteUseCase: DeleteNoteUseCase,
    private val getNoteUseCase: GetNoteUseCase,
    //private val updateNoteUseCase: UpdateNoteUseCase

) : ViewModel() {

    private val _notes = mutableStateOf<List<NoteModel>>(emptyList())
    val notes : State<List<NoteModel>> = _notes

    private val _notesDetail = mutableStateOf<NoteModel?>(null)
    val notesDetail : State<NoteModel?> = _notesDetail

    init {
        getAllNotes()
    }

    private fun getAllNotes(){
        viewModelScope.launch {
            _notes.value = getNotesUseCase()
        }
    }

    fun getNotes(id : Int){
        viewModelScope.launch {
            _notesDetail.value = getNoteUseCase(id)
        }
    }



//    fun addNote(text : String , details: String){
//        viewModelScope.launch {
//            addNoteUseCase(note = NoteModel(noteTitle  = text , noteDescription = details))
//            getAllNotes()
//
//
//        }
//    }
//
//    fun deleteNote(id : Int){
//        viewModelScope.launch {
//            deleteNoteUseCase(id)
//            getAllNotes()
//


}
