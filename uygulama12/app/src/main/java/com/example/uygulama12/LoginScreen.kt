package com.example.uygulama12

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(onNavigateRegister: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Text(text = "Giriş Yap Sayfası", fontSize = 24.sp)

        TextField(
            value = email,
            label = {
                Text(text = "Email")
            },
            onValueChange = {
                email = it
            }
        )

        Spacer(modifier = Modifier.size(16.dp))

        TextField(
            value = password,
            label = {
                Text(text = "Password")
            },
            onValueChange = {
                password = it
            }
        )

        Spacer(modifier = Modifier.size(16.dp))

        Button(onClick = { onNavigateRegister() }) {
            Text(text = "Giriş Yap")
        }

        Button(onClick = { onNavigateRegister() }) {
            Text(text = "Kayıt Yap")
        }
    }
}
