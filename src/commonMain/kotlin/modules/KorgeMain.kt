package modules

import `class`.MyDependency
import com.soywiz.korge.scene.Module
import com.soywiz.korge.scene.Scene
import com.soywiz.korinject.AsyncInjector
import scenes.Scene1
import scenes.Scene2
import kotlin.reflect.KClass

object MyModule : Module() {
    override val mainScene: KClass<out Scene> = Scene1::class

    override suspend fun AsyncInjector.configure(): Unit {
        mapInstance(MyDependency("HELLO WORLD"))
        mapPrototype { Scene1(get()) }
        mapPrototype { Scene2(get()) }
    }
}