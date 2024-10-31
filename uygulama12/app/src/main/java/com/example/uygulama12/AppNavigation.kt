package com.example.uygulama12

enum class Screen {
    NOTE ,
    NOTE_DETAIL,
    NOTE_ADD,
    FLAGS,
    LOGIN,
    REGISTER

}

sealed class NavigationItem(val route : String){
    object Note : NavigationItem(Screen.NOTE.name)
    object NoteDetail : NavigationItem(Screen.NOTE_DETAIL.name)
    object NoteAdd : NavigationItem(Screen.NOTE_ADD.name)
    object Flags : NavigationItem(Screen.FLAGS.name)
    object Login : NavigationItem(Screen.LOGIN.name)
    object Register : NavigationItem(Screen.REGISTER.name)

}