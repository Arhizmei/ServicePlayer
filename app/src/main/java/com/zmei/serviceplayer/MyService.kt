package com.zmei.serviceplayer

import android.content.Intent
import android.media.MediaPlayer
import android.provider.Settings
import android.os.IBinder

class MyService : android.app.Service() {

    private lateinit var player: MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        player.setLooping( true)
        player.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}