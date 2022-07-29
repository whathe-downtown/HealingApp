package com.example.healingapp.ui.theme.screen.home.feature

import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.healingapp.data.Mindless
import com.example.healingapp.repository.SampleRepository

class DetailViewModel : ViewModel() {

   private val _elements = mutableStateListOf<Mindless>()
    var element : List<Mindless> = _elements


    var title by mutableStateOf("")
        private set

//    fun onEvent(event: DetailFeatureEvent){
//        when(event){
//            is DetailFeatureEvent.OnSelectChange ->{
//                element = SampleRepository.mindlessList
//            }
//        }
//    }
}