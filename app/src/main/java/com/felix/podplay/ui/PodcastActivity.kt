package com.felix.podplay.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.felix.podplay.R
import com.felix.podplay.repository.ItunesRepo
import com.felix.podplay.service.ItunesService

class PodcastActivity : AppCompatActivity() {

    val TAG = javaClass.simpleName

    val itunesService = ItunesService.instance

    val itunesRepo = ItunesRepo(itunesService)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcast)

        itunesRepo.searchByTerm("Android Developer") {
            Log.i(TAG, "Results = $it")
        }
    }
}
