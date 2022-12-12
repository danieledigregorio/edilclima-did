package it.polito.did.edilclima.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import it.polito.did.edilclima.GameViewModel
import it.polito.did.edilclima.screens.HomeScreen
import it.polito.did.edilclima.screens.LoginScreen

@Composable
fun NavGraph(navController: NavHostController) {
    val vm: GameViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = Screens.Login.route,
    ) {
        composable(route = Screens.Login.route) {
            LoginScreen(navController, vm::onWriteDB)
        }
        composable(route = Screens.Home.route) {
            HomeScreen(navController)
        }
    }
}