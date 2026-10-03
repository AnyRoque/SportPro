package pe.edu.esan.sportpro.presentation.auth

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import pe.edu.esan.sportpro.presentation.components.ComingSoon
import pe.edu.esan.sportpro.presentation.navigation.Routes
import androidx.compose.material3.Text
import androidx.navigation.NavHostController

// STUB: este archivo lo reemplaza Jelinek (US-01) en su Pull Request.
fun NavGraphBuilder.authGraph(navController: NavHostController, authViewModel: AuthViewModel) {
    composable(Routes.LOGIN) { ComingSoon("Inicio de sesión (US-01)") }
    composable(Routes.REGISTER) { Text("Registro (US-01)") }
    composable(Routes.FORGOT_PASSWORD) { Text("Recuperar contraseña (US-01)") }
}
