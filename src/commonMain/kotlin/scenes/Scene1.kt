package scenes

import `class`.MyDependency
import com.soywiz.klogger.Logger
import com.soywiz.korge.input.onClick
import com.soywiz.korge.input.onOut
import com.soywiz.korge.input.onOver
import com.soywiz.korge.scene.Scene
import com.soywiz.korge.view.Container
import com.soywiz.korge.view.position
import com.soywiz.korge.view.solidRect
import com.soywiz.korge.view.text
import com.soywiz.korim.bitmap.NativeImage
import com.soywiz.korim.color.Colors
import com.soywiz.korim.font.Font
import com.soywiz.korim.font.TtfFont
import com.soywiz.korio.file.std.resourcesVfs
import com.soywiz.korio.stream.openSync

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

class Scene1(val myDependency: MyDependency) : Scene() {
    override suspend fun Container.sceneInit() {
        text("MyScene1: ${myDependency.value}") { filtering = false }
        solidRect(100, 100, Colors.SNOW) {
            position(0, 0)
            alpha = 0.7
            onOver { alpha = 1.0 }
            onOut { alpha = 0.7 }
            onClick {
                sceneContainer.changeTo<Scene2>()
            }
        }
        solidRect(100, 100, Colors.BLUE) {
            position(50, 50)
            alpha = 0.7
            onOver { alpha = 1.0 }
            onOut { alpha = 0.7 }
            onClick {
                sceneContainer.changeTo<Scene2>()
            }
        }

        write("coucou")

    }

    override suspend fun sceneBeforeLeaving() {
        logger.info(msg = { "Scene is destroyed" })
    }
}

suspend fun write(text:String,fontName:String="Lato-Regular",folder:String="lato" ,format:String="ttf"){
    val fontFile : Font = TtfFont(resourcesVfs["fonts/$folder/$fontName.$format"].readAll().openSync())
    val bitmap = NativeImage(512, 128).apply {
        getContext2d().fillText(font=fontFile,text = text, fontSize = 32.0, x = 20.0, y = 20.0, color = Colors.RED)
    }
}