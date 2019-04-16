package com.nemov.shinyusabillacampaign

import android.app.Application
import android.util.Log
import com.usabilla.sdk.ubform.Usabilla
import com.usabilla.sdk.ubform.UsabillaReadyCallback

class ApplicationExt: Application(), UsabillaReadyCallback {

    val TAG = ApplicationExt::class.java.simpleName

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
        Log.d(TAG, "Usabilla is initialized")
    }
}