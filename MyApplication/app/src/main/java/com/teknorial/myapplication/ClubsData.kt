package com.teknorial.myapplication

import java.util.*

//import java.util.*

object ClubsData {
    private  val clubNames = arrayOf(
        "Persib",
        "Persija",
        "Barito Putera",
        "Persebaya",
        "PSIS",
        "Bali United",
        "Rans Cilegon FC",
        "Persipura",
        "PSM Makassar",
        "PSMS Medan",
        "PSS Sleman"
    )
    
    private val clubDetails = arrayOf(
        "Desc Persib",
        "Desc Persija",
        "Desc Barito",
        "Desc Persebaya",
        "Desc PSIS",
        "Desc Bali",
        "Desc Rans",
        "Desc Persipura",
        "Desc PSM",
        "Desc PSMS",
        "Desc PSS",
    )

    private  val clubImages = intArrayOf(
        R.drawable.psb,
        R.drawable.persija,
        R.drawable.barito,
        R.drawable.persebaya,
        R.drawable.psis,
        R.drawable.bali,
        R.drawable.rans,
        R.drawable.persipura,
        R.drawable.psm,
        R.drawable.psms,
        R.drawable.pss,
    )
    
    val listData: ArrayList<Club>
        get(){
            val list = arrayListOf<Club>()
            for (position in clubNames.indices){
                val club = Club()
                club.name = clubNames[position]
                club.detail = clubDetails[position]
                club.photo = clubImages[position]
                list.add(club)
            }
            return list
        }
}