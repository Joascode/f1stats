package com.joascode.f1stats.standings

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.joascode.f1stats.teams.F1Team
import kotlinx.coroutines.delay
import org.json.JSONArray

class StandingsRepository(
    private val gson: Gson = Gson()
) {
    private inline fun <reified T> Gson.fromJson(json: String) = this.fromJson<T>(json, object: TypeToken<T>() {}.type)

    suspend fun getStandings(): StandingsState {

        val json = JSONArray(standings)
        delay(1000)
        return StandingsState(gson.fromJson<List<F1Team>>(json.toString()), loading = false)
    }
}

private const val standings = """[{"name": "Mercedes"},{"name": "Aston Martin"},{"name": "Ferrari"},{"name": "Red Bull"},{"name": "AlphaTauri"},{"name": "McLaren"},{"name": "Alpine"},{"name": "Alfa Romeo"},{"name": "Haas"},{"name": "Williams"}]"""