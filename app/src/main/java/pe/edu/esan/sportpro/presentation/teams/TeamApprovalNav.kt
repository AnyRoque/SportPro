package pe.edu.esan.sportpro.presentation.teams

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import pe.edu.esan.sportpro.presentation.components.ComingSoon
import pe.edu.esan.sportpro.presentation.navigation.Routes
import pe.edu.esan.sportpro.presentation.navigation.Secured
import pe.edu.esan.sportpro.presentation.navigation.SecuredContext

// STUB: este archivo lo reemplaza Juan Arturo (US-07) en su Pull Request.
fun NavGraphBuilder.teamApprovalGraph(sec: SecuredContext) {
    composable(Routes.TEAM_APPROVAL) { sec.Secured("Validar equipos") { ComingSoon("Validación de equipos (US-07)") } }
}
