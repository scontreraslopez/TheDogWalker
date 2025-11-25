package net.iessochoa.sergiocontreras.thedogwalker.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import net.iessochoa.sergiocontreras.thedogwalker.model.Dog

class DogWalkerViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(DogWalkerUiState())
    val uiState: StateFlow<DogWalkerUiState> = _uiState.asStateFlow()

    fun onDogSelected(dog: Dog) {
        _uiState.update { currentState ->
            // Usamos .copy() para servir un nuevo estado con la selección actualizada
            currentState.copy(
                selectedDog = dog
            )
        }
    }

    fun onToggleSelected(type: String) {
        _uiState.update { currentState ->

            val newDog = currentState.selectedDog

            when (type) {
              "walked" -> newDog!!.copy(isWalked = !newDog.isWalked)
                "pee" -> newDog!!.copy(hasPeed = !newDog.hasPeed)
                else -> newDog!!.copy(hasPooped = !newDog.hasPooped)
            }

            currentState.copy(
                selectedDog = newDog
            )

        }
    }

}