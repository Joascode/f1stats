package com.joascode.f1stats.standings

import com.joascode.f1stats.teams.F1Team

data class StandingsState(
    val teams: List<F1Team> = emptyList(),
    val loading: Boolean = true
)
