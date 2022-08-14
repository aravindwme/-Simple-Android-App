package com.teknorial.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var rvClub: RecyclerView
    private var list : ArrayList<Club> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClub = findViewById(R.id.rv_club)
        rvClub.setHasFixedSize(true)

        list.addAll(ClubsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvClub.layoutManager = LinearLayoutManager(this)
        val listClubAdapter = ListClubAdapter(list)
        rvClub.adapter = listClubAdapter
    }
}