package net.iessochoa.sergiocontreras.thedogwalker.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import net.iessochoa.sergiocontreras.thedogwalker.data.DogRepository
import net.iessochoa.sergiocontreras.thedogwalker.model.Dog
import net.iessochoa.sergiocontreras.thedogwalker.ui.DogWalkerViewModel
import net.iessochoa.sergiocontreras.thedogwalker.ui.components.DogCard
import net.iessochoa.sergiocontreras.thedogwalker.ui.theme.TheDogWalkerTheme

@Composable
fun DogListScreen(
    dogs: List<Dog>,
    modifier: Modifier = Modifier,
    viewModel: DogWalkerViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LazyColumn(contentPadding = PaddingValues(16.dp), modifier = modifier) {
        items(dogs) { dog ->
            DogCard(dog)
        }
    }
}

@Preview(showBackground=true)
@Composable
private fun DogListScreenPreview() {
    val dogList = DogRepository.getAllDogs()
    TheDogWalkerTheme {
        DogListScreen(
            dogs = dogList
        )
    }
}