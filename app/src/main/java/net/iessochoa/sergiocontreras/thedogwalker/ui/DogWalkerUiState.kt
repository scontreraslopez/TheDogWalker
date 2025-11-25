package net.iessochoa.sergiocontreras.thedogwalker.ui

import net.iessochoa.sergiocontreras.thedogwalker.data.DogRepository
import net.iessochoa.sergiocontreras.thedogwalker.model.Dog

data class DogWalkerUiState (
    val dogs: List<Dog> = DogRepository.getAllDogs(),
    val selectedDog: Dog? = null
)