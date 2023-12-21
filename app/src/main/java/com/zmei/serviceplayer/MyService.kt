package com.zmei.serviceplayer

import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : android.app.Service() {

    private lateinit var player: MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }


    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}