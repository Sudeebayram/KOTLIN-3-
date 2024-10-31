package com.example.uygulama12

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.uygulama12.flags.FlagsScreen
//import com.example.uygulama12.notes.NoteScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = NavigationItem.Login.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(NavigationItem.Note.route) {
            NoteScreen(
                onClickFlags = {
                    navController.navigate(NavigationItem.Flags.route)
                },
                onClickAdd = {
                    navController.navigate(NavigationItem.NoteAdd.route)
                },
                onClickDetails = {
                    navController.navigate(NavigationItem.NoteDetail.route)

        }
            )

        }
        composable(NavigationItem.Flags.route) {
            FlagsScreen()
    }
        composable(NavigationItem.Login.route) {
            LoginScreen(onNavigateRegister = {
                navController.navigate(NavigationItem.Register.route)

            })
        }
        composable(NavigationItem.Register.route) {
            RegisterScreen(onNavigateLogin = {
                navController.popBackStack()
            }
            )
        }
    }
}
