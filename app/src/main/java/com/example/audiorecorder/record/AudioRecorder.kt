package com.example.audiorecorder.record

import android.content.Context
import java.io.File

/**
 * Created by Clarence E Moore on 2023-02-26.
 *
 * Description:
 *
 *
 */
interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}
