package net.iessochoa.sergiocontreras.thedogwalker.ui.navigation

import androidx.compose.ui.res.stringResource
import net.iessochoa.sergiocontreras.thedogwalker.R

interface NavigationDestination {
    val route: String
    val titleRes: Int
}

// Destino 1: La pantalla principal (Lista de Perros)
object DogListDestination : NavigationDestination {
    override val route = "main"
    override val titleRes = R.string.app_name
}
    


// Destino 2: La pantalla secundaria (Detalle del Perro)
object DogDetailDestination : NavigationDestination {
    override val route = "detail"
    override val titleRes = R.string.title_dog_detail
    // TODO: Implementa las propiedades de la interfaz para la pantalla de detalle
}