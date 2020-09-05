import com.soywiz.korge.Korge
import modules.MyModule
import utils.Resolution

/**
 *  Main entry point for the game. To start it, run the gradle tasks:
 * `runJVM` - to run it with JAVA.
 * `runJS` - to run it as HTML Web App.
 * `runAndroidDebug` - to install and start it on an Android device.
 */

const val debug = false
const val playBackgroundMusic = false

/**
 * Virtual size which gets projected onto the [windowResolution]
 */
val virtualResolution = Resolution(width = 1280, height = 800)
suspend fun main() = Korge(Korge.Config(module = MyModule, debug = false))