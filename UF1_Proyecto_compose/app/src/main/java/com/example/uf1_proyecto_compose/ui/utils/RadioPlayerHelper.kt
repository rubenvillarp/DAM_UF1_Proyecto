package com.example.uf1_proyecto_compose.ui.utils

import android.content.Context
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.widget.Toast
import com.example.uf1_proyecto_compose.R
import com.example.uf1_proyecto_compose.playing

class RadioPlayerHelper {
    companion object {
        const val LOW_QUALITY = "https://ro.novahit.net/listen/novahit/nh128.mp3"
        const val MEDIUM_QUALITY = "https://ro.novahit.net/listen/novahit/nh192.mp3"
        const val HIGH_QUALITY = "https://ro.novahit.net/listen/novahit/nh320.mp3"
        private const val DEFAULT_QUALITY = MEDIUM_QUALITY
        private var mediaPlayer: MediaPlayer? = null
        private var currentPosition = 0
        var quality = DEFAULT_QUALITY
        var context: Context? = null

        fun play() {
            if (quality.equals(R.string.select_quality)) {
                quality = DEFAULT_QUALITY
            }
            mediaPlayer?.let {
                it.stop()
                it.release()
            }
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer().apply {
                setAudioAttributes(
                    AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
                )
                setDataSource(
                    quality
                )
                prepareAsync()
                Toast.makeText(
                    context,
                    "Connecting...",
                    Toast.LENGTH_SHORT
                ).show()
                setOnPreparedListener(MediaPlayer.OnPreparedListener {
                    it.start()
                    playing = true
                    Toast.makeText(
                        context,
                        "Playing",
                        Toast.LENGTH_SHORT
                    ).show()
                })
            }
        }

        fun pause() {
            mediaPlayer?.let {
                if (it.isPlaying) {
                    it.pause()
                    currentPosition = it.currentPosition
                    playing = false
                }
            }
        }

        fun resume() {
            mediaPlayer?.let {
                if (!it.isPlaying) {
                    it.seekTo(currentPosition)
                    it.start()
                    playing = true
                }
            }
        }

        fun stop() {
            mediaPlayer?.let {
                it.stop()
                it.release()
                mediaPlayer = null
            }
            Toast.makeText(
                context,
                "Stopping...",
                Toast.LENGTH_SHORT
            ).show()
            playing = false
        }

        fun release() {
            mediaPlayer?.let {
                it.release()
            }
            playing = false
        }
    }
}