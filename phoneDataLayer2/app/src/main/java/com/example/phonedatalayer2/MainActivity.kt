package com.example.phonedatalayer2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.wearable.Wearable

class MainActivity : AppCompatActivity() {
    private val dataClient by lazy { Wearable.getDataClient(this) }
    private val capabilityClient by lazy { Wearable.getCapabilityClient(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}