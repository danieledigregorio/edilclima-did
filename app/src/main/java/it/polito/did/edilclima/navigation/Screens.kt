package it.polito.did.edilclima.navigation

import androidx.lifecycle.LiveData

sealed class Screens() {

    object Login: Screens()
    class WaitingRoom(val gamecode: String) : Screens()
    class GroupAssigned(val teamcode: String) : Screens()
    class Home(val gamecode: String, val teamcode: String): Screens()
    class Imprevisto(): Screens()
}