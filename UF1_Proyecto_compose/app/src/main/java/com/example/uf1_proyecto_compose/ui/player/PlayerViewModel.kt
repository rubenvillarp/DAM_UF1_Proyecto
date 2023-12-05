package com.example.uf1_proyecto_compose.ui.player

import android.content.Context
import android.media.AsyncPlayer
import androidx.lifecycle.ViewModel

class PlayerViewModel : ViewModel() {
    private var player = AsyncPlayer("player")


    fun getPlayer(context: Context): AsyncPlayer {
        return player
    }


}