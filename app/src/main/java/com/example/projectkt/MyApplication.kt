package com.example.projectkt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    // For a basic Hilt setup, this class can remain empty.
    // The @HiltAndroidApp annotation is what does all the work.
}
