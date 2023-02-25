package com.example.interviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.JsonObject
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject
import timber.log.Timber
import timber.log.Timber.DebugTree
import java.net.URL

class MainActivity : AppCompatActivity() {
     var _getRequest: GetRequest? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(DebugTree())
        Timber.d("Timber Planted")
        println("Timber Planted 1")
        //_getRequest?.getJSON()
        getJSON()

    }

    fun getJSON() =
        GlobalScope.launch {
            var url =
                URL("https://gist.githubusercontent.com/peymano-wmt/32dcb892b06648910ddd40406e37fdab/raw/db25946fd77c5873b0303b858e861ce724e0dcd0/countries.json")
                    .readText()



            val json = JSONArray(url)

            var gson =  Gson()

           // var testModel = gson.toJson(json)
            //var testModel = gson.fromJson<CountryModel>(json)

            println(json)

          print("Kenneth")

        }


}