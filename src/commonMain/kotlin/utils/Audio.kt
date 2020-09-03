
@file:JvmName("Audio")

package utils
import com.soywiz.korau.sound.readSound
import com.soywiz.korio.file.VfsFile
import com.soywiz.korio.file.std.resourcesVfs
import kotlin.jvm.JvmName

suspend fun load(sound:String,format:String="ogg",autoPlay:Boolean=true){
val soundFile:VfsFile by lazy { resourcesVfs["sounds/$sound.$format"]  }
    autoPlay.ifTrue  { soundFile.readSound() }
}