package com.example.viewbindingexample.vmrecyclerviewfilm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewbindingexample.R

class FilmViewModel : ViewModel() {

    val list = arrayListOf(
        DataFilm(R.mipmap.bumi_manusia_foreground,"Bumi Manusia", "12 Oktober 2020"),
        DataFilm(R.mipmap.kkn_desa_penari_foreground,"KKN Desa Penari", "21 Mei 2022"),
        DataFilm(R.mipmap.wakop_dki_round,"Warkop DKI Reborn", "18 Januari 2019"),
        DataFilm(R.mipmap.aquaman_foreground,"Aquaman", "18 Maret 2018"),
        DataFilm(R.mipmap.keluarga_cemara_foreground,"Keluarga Cemara", "25 Agustus 2016")

    )

    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        filmList.value = list
    }
}