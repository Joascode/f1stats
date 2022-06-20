package com.joascode.f1stats.standings

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class StandingsViewModel(
    private val standingsRepository: StandingsRepository = StandingsRepository()
) : ViewModel() {
    var standings by mutableStateOf(StandingsState())

    init {
        viewModelScope.launch {
            standings = standingsRepository.getStandings()
        }
    }
}