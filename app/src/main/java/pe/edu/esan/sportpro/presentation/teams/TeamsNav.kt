package pe.edu.esan.sportpro.presentation.teams

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import pe.edu.esan.sportpro.presentation.components.ComingSoon
import pe.edu.esan.sportpro.presentation.navigation.Routes
import pe.edu.esan.sportpro.presentation.navigation.Secured
import pe.edu.esan.sportpro.presentation.navigation.SecuredContext

// STUB: este archivo lo reemplaza Christ (US-03) en su Pull Request.
fun NavGraphBuilder.teamsGraph(sec: SecuredContext) {
    composable(Routes.MY_TEAMS) { sec.Secured("Mis equipos") { ComingSoon("Mis equipos (US-03)") } }
    composable(Routes.TEAM_FORM) { sec.Secured("Nuevo equipo") { ComingSoon("Registro de equipos (US-03)") } }
}
