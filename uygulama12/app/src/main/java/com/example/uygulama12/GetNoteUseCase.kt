package com.example.uygulama12

import javax.inject.Inject

class GetNoteUseCase @Inject constructor(private val notesRepository: NotesRepostory) {
    suspend operator fun invoke(id : Int) : NoteModel = notesRepository.getNotes(id)

}

class AddNoteUseCase {
    suspend operator fun invoke(note: NoteModel) {
    }
}

class DeleteNoteUseCase {
    suspend operator fun invoke(id: Int) {

    }
}

class GetNotesUseCase {
    suspend operator fun invoke(): List<NoteModel> {
        return listOf()
    }
}

