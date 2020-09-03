@file:JvmName("Fonts")

package utils
import com.soywiz.korim.bitmap.NativeImage
import com.soywiz.korim.color.Colors
import com.soywiz.korim.font.Font
import com.soywiz.korim.font.TtfFont
import com.soywiz.korio.file.std.resourcesVfs
import com.soywiz.korio.stream.openSync
import kotlin.jvm.JvmName

 suspend fun load(fontName:String, format:String="ttf"){
    val fontFile :Font = TtfFont(resourcesVfs["fonts/$fontName.$format"].readAll().openSync())
     val bitmap = NativeImage(512, 128).apply {
         getContext2d().fillText("HELLO WORLD",font=fontFile, fontSize = 32.0, x = 0.0, y = 0.0, color = Colors.RED)
     }
}