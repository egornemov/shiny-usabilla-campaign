package com.nemov.shinyusabillacampaign

import android.app.Application
import android.widget.Toast
import com.usabilla.sdk.ubform.Usabilla
import com.usabilla.sdk.ubform.UsabillaReadyCallback

class ApplicationExt: Application(), UsabillaReadyCallback {

    override fun onCreate() {
        super.onCreate()
        initializeUsabillaSdk()
    }

    private fun initializeUsabillaSdk() {
        Usabilla.initialize(this, APP_ID, null, this)
        Usabilla.removeCachedForms()
        Usabilla.resetCampaignData(this, this)
        Usabilla.debugEnabled = true
    }

    override fun onUsabillaInitialized() {
        Toast.makeText(applicationContext, "Usabilla is initialized", Toast.LENGTH_SHORT).show()
    }
}