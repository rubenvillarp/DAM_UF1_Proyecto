package com.example.uf1_proyecto_compose.ui.utils

import android.media.AudioAttributes
import android.media.MediaPlayer

const val LOW_QUALITY = "LOW"
const val MEDIUM_QUALITY = "MEDIUM"
const val HIGH_QUALITY = "HIGH"
private const val LQ_URL = ""
private const val MQ_URL = ""
private const val HQ_URL = ""
private const val DEFAULT_QUALITY = MEDIUM_QUALITY

var play = false
var quality = DEFAULT_QUALITY

class RadioPlayer : MediaPlayer() {
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