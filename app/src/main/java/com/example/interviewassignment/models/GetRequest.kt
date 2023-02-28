package com.example.interviewassignment.models
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import timber.log.Timber
import java.net.URL

class GetRequest(){
    fun getJSON() =
        GlobalScope.launch {
            val url =
                URL("https://gist.githubusercontent.com/peymano-wmt/32dcb892b06648910ddd40406e37fdab/raw/db25946fd77c5873b0303b858e861ce724e0dcd0/countries.json").readText()
            Timber.d("Incoming JSON")

        }
}




