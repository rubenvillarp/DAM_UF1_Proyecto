package com.example.uf1_proyecto_compose.ui.utils

import android.content.Context
import android.media.AsyncPlayer
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri

const val LOW_QUALITY = "LOW"
const val MEDIUM_QUALITY = "MEDIUM"
const val HIGH_QUALITY = "HIGH"
private const val LQ_URL = "https://ro.novahit.net/listen/novahit/nh128.mp3"
private const val MQ_URL = "https://ro.novahit.net/listen/novahit/nh192.mp3"
private const val HQ_URL = "https://ro.novahit.net/listen/novahit/nh320.mp3"
private const val DEFAULT_QUALITY = MEDIUM_QUALITY

var play = false
var quality = DEFAULT_QUALITY

class RadioPlayer : MediaPlayer() {
    fun play(context: Context, uri: Uri) {
        val player = AsyncPlayer("player")
        player.play(
            context,
            uri,
            false,
            AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build()
        )
    }

    fun stop(context: Context) {
        val player = AsyncPlayer("player")
        player.stop()
    }

    fun playLQ() {
        val mediaPlayer = MediaPlayer().apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
            setDataSource(LQ_URL)
            prepareAsync()
            start()
        }
    }

    fun playMQ() {
        val mediaPlayer = MediaPlayer().apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
            setDataSource(MQ_URL)
            prepareAsync()
            start()
        }
    }

    fun playHQ() {
        val mediaPlayer = MediaPlayer().apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
            setDataSource(HQ_URL)
            prepareAsync()
            start()
        }
    }
}