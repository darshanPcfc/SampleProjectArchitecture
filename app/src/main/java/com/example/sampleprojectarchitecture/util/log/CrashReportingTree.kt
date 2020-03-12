package com.example.sampleprojectarchitecture.util.log

import android.util.Log
import com.crashlytics.android.Crashlytics
import com.example.sampleprojectarchitecture.util.constants.Constants
import timber.log.Timber

/**
 * Created by Darshan Patel 24/02/2020
 * Usage: for logging crashses only in production environment
 * How to call: would be called by custom logger
 *
 */
class CrashReportingTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, throwable: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }

        val t = throwable ?: Exception(message)

        // Crashlytics
        Crashlytics.setInt(Constants.CRASHLYTICS_KEY_PRIORITY, priority)
        Crashlytics.setString(Constants.CRASHLYTICS_KEY_TAG, tag)
        Crashlytics.setString(Constants.CRASHLYTICS_KEY_MESSAGE, message)
        Crashlytics.logException(t)

        // Firebase Crash Reporting
        // FirebaseCrash.logcat(priority, tag, message)
        // FirebaseCrash.report(t)
    }
}