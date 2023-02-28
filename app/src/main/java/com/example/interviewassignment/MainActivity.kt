package com.example.interviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.interviewassignment.adapter.ItemAdapter
import com.example.interviewassignment.models.CountryModel
import com.google.gson.Gson
import kotlinx.coroutines.*
import timber.log.Timber
import timber.log.Timber.DebugTree
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(DebugTree())
        Timber.d("Timber Planted")
        retrieveData()
    }

    private fun retrieveData(){
        GlobalScope.launch {
            var url =
                URL("https://gist.githubusercontent.com/peymano-wmt/32dcb892b06648910ddd40406e37fdab/raw/db25946fd77c5873b0303b858e861ce724e0dcd0/countries.json")
                    .readText()
            ConvertToModel(url)
        }
    }

    private fun ConvertToModel(url: String, ) {
        var gson = Gson()
        var testModel1: Array<CountryModel>

        GlobalScope.launch(Dispatchers.Main) {
            testModel1 = gson.fromJson(url, Array<CountryModel>::class.java)
            updateRecyclerView(testModel1)
        }
    }


        private fun updateRecyclerView(countryModel: Array<CountryModel>){
            val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
            recyclerView.adapter = ItemAdapter(countryModel)
        }
    }

