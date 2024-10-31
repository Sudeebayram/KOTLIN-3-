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
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.ktx.auth

private lateinit var auth: FirebaseAuth

@Composable
fun RegisterScreen(onNavigateLogin: () -> Unit) {


    auth = Firebase.auth

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var passwordRepeat by remember { mutableStateOf("") }
        var message by remember { mutableStateOf("") }

        Text(text = "Kayıt Ol Sayfası", fontSize = 24.sp)

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

        TextField(
            value = passwordRepeat,
            label = {
                Text(text = "Password Repeat")
            },
            onValueChange = {
                passwordRepeat = it
            }
        )

        Spacer(modifier = Modifier.size(16.dp))

        Button(onClick = {

            if (email.isNotEmpty() && password.isNotEmpty() && passwordRepeat.isNotEmpty() && password == passwordRepeat) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            onNavigateLogin()
                        }
                        else
                        {
                        }
                    }
            }
        }) {
            Text(text = "Kayıt Ol")
        }
    }
}
