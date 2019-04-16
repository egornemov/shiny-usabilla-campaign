@file:JvmName("FeedbackConfig")
package com.nemov.shinyusabillacampaign

import android.content.Context
import com.usabilla.sdk.ubform.Usabilla

const val APP_ID = "e714a377-24c4-4296-a4b4-7429895aab89"

const val CAMPAIGN_EVENT = "test01"

fun sendEvent(context: Context, fragmentManager: androidx.fragment.app.FragmentManager) {
    Usabilla.updateFragmentManager(fragmentManager)
    Usabilla.sendEvent(context, CAMPAIGN_EVENT)
}