package pe.edu.esan.sportpro.presentation.children

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import pe.edu.esan.sportpro.presentation.components.ComingSoon
import pe.edu.esan.sportpro.presentation.navigation.Routes
import pe.edu.esan.sportpro.presentation.navigation.Secured
import pe.edu.esan.sportpro.presentation.navigation.SecuredContext

// STUB: este archivo lo reemplaza Jelinek (US-02) en su Pull Request.
fun NavGraphBuilder.childrenGraph(sec: SecuredContext) {
    composable(Routes.MY_CHILDREN) { sec.Secured("Mis hijos") { ComingSoon("Mis hijos (US-02)") } }
    composable(Routes.CHILD_FORM) { sec.Secured("Registro de hijos") { ComingSoon("Registro de hijos (US-02)") } }
}
