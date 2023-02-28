package com.example.audiorecorder.playback

import java.io.File

/**
 * Created by Clarence E Moore on 2023-02-26.
 *
 * Description:
 *
 *
 */
interface AudioPlayer {
    fun playFile(file: File)
    fun stop()
}
