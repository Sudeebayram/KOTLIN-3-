package com.example.uygulama12

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun NoteDetailScreen(viewModel : NotesViewModel = hiltViewModel() , id: String)  {
    viewModel.getNotes(id = id.toInt())

    val noteUiState by viewModel.notesDetail

    Column (modifier = Modifier.fillMaxSize()) {
        Text(text = noteUiState?.noteTitle.orEmpty(), fontSize = 24.sp)
        Text(text = noteUiState?.noteTitle.orEmpty(), fontSize = 16.sp)
        Spacer(
            modifier = Modifier.size(16.dp)
        )

    }




}