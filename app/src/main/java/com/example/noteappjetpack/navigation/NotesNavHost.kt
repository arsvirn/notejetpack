package com.example.noteappjetpack.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.noteappjetpack.screens.Add
import com.example.noteappjetpack.screens.Main
import com.example.noteappjetpack.screens.Note
import com.example.noteappjetpack.screens.Start

sealed class NavRoutes(val route: String) {
    object Start: NavRoutes("start_screen")
    object Main: NavRoutes("main_screen")
    object Add: NavRoutes("add_screen")
    object Note: NavRoutes("note_screen")
}

@Composable
fun NotesNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoutes.Start.route) {
        composable(NavRoutes.Start.route) { Start(navController = navController) }
        composable(NavRoutes.Main.route) { Main(navController = navController) }
        composable(NavRoutes.Add.route) { Add(navController = navController) }
        composable(NavRoutes.Note.route) { Note(navController = navController) }
    }
}