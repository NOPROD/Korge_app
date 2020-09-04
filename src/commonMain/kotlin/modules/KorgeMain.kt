package modules

import `class`.MyDependency
import com.soywiz.korge.scene.Module
import com.soywiz.korge.scene.Scene
import com.soywiz.korim.color.RGBA
import com.soywiz.korinject.AsyncInjector
import scenes.Scene1
import scenes.Scene2
import kotlin.reflect.KClass

object MyModule : Module() {
    override val mainScene: KClass<out Scene> = Scene1::class

    override val bgcolor: RGBA =  RGBA(8421504)

    override val title: String = "Korge app title"

    override suspend fun AsyncInjector.configure(): Unit {

        mapInstance(MyDependency("HELLO WORLD"))
        mapPrototype { Scene1(get()) }
        mapPrototype { Scene2(get()) }
    }
}