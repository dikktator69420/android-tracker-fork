package com.example.androidtracker.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androidtracker.viewmodels.OsmVM
import ovh.plrapps.mapcompose.ui.MapUI

@Composable
fun OsmDemo(
    viewModel: OsmVM = viewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = "Location: 48.18699396030242, 16.356373567789245",
            )
        }
    )
}