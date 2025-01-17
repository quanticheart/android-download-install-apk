package com.quanticheart.downloadapk

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.quanticheart.downloadapk.MainActivity.Companion.TAG

class DevAdminReceiver : DeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Log.d(TAG, "Device Owner Enabled")
    }
}