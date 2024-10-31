package com.example.uygulama12

import android.telecom.Call.Details
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
//import com.example.uygulama12.models.NoteModel
//import com.example.uygulama12.notes.NotesViewModel

@Composable
fun NoteScreen(viewModel: NotesViewModel = hiltViewModel() , onClickDetails: (Int) -> Unit , onClickAdd: () -> Unit , onClickFlags: () -> Unit) {
    val noteUiState by viewModel.notes

    Column {
        Button(onClick = onClickFlags) {
            Text(text = "Ülkelere Git")

        }
//        noteUiState.notes.forEach { note ->
//            NoteItem(note = note, onClick = onClickDetails)
//        }

        Button(onClick = onClickAdd, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Yeni Not Ekle")
        }

    }
    @Composable
    fun NoteItem(note: NoteModel, onClick: (Int) -> Unit) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick(note.id) }
                .padding(8.dp)
        ) {
            Text(modifier = Modifier.padding(16.dp), text = note.noteTitle)
        }
    }}