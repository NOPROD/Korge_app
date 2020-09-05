package scenes

import `class`.MyDependency
import com.soywiz.korge.input.onClick
import com.soywiz.korge.input.onOut
import com.soywiz.korge.input.onOver
import com.soywiz.korge.scene.Scene
import com.soywiz.korge.view.Container
import com.soywiz.korge.view.position
import com.soywiz.korge.view.solidRect
import com.soywiz.korge.view.text
import com.soywiz.korim.color.Colors


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
    }
}