package pe.edu.esan.sportpro.presentation.players

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import pe.edu.esan.sportpro.presentation.components.ComingSoon
import pe.edu.esan.sportpro.presentation.navigation.Routes
import pe.edu.esan.sportpro.presentation.navigation.Secured
import pe.edu.esan.sportpro.presentation.navigation.SecuredContext

// STUB: este archivo lo reemplaza Jesús (US-04) en su Pull Request.
fun NavGraphBuilder.playersGraph(sec: SecuredContext) {
    composable(Routes.ROSTER) { sec.Secured("Plantel", showBack = true) { ComingSoon("Plantel (US-04)") } }
    composable(Routes.PLAYER_FORM) { sec.Secured("Jugador", showBack = true) { ComingSoon("Perfil del jugador (US-04)") } }
    composable(Routes.PLAYER_DETAIL) { sec.Secured("Jugador", showBack = true) { ComingSoon("Perfil del jugador (US-04)") } }
}
