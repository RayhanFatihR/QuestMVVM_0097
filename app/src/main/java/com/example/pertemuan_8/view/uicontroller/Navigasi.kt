package com.example.pertemuan_8.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan_8.model.DataJK.JenisK
import com.example.pertemuan_8.view.FormSiswa
import com.example.pertemuan_8.view.TampilSiswa
import com.example.pertemuan_8.viewmodel.SiswaViewModel

enum class Navigasi {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    //edit 1 : parameter viewModel
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang ->
        //edit 2 : tambahkan variabel uiState
        val uiState by viewModel.statusUI.collectAsState()

        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,
            modifier = Modifier.padding(isiRuang)
        ){

        }
    }
}


