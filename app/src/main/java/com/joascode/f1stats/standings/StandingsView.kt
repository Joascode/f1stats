package com.joascode.f1stats.standings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Standings(
    viewModel: StandingsViewModel = viewModel()
) {
    val value = viewModel.standings
    if(value.loading) {
        Text(text = "Loading..")
    } else {
        Column {
            for(team in value.teams) {
                Text(text = team.name)
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun StandingsPreview() {
    Standings()
}