@file:JvmName("Sprites")

package utils

import com.soywiz.korim.bitmap.Bitmap
import com.soywiz.korim.format.readBitmap
import com.soywiz.korio.file.std.resourcesVfs
import kotlin.jvm.JvmName

suspend fun imageToAnimatedSprite(file: String, format: String = "png") {
    val soundFile: Bitmap = resourcesVfs["sprites/$file.$format"].readBitmap()
}