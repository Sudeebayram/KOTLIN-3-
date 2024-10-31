package com.example.uygulama12.flags

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun FlagsScreen(viewModel: FlagsViewModel = hiltViewModel()) {
    val flags by viewModel.flags

    LazyColumn(modifier = Modifier.fillMaxSize() , verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(flags){item ->
            Text(text = item.name)

        }
        }
    }

