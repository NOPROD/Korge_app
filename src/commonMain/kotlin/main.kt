import `class`.MyDependency
import com.soywiz.korge.Korge
import com.soywiz.korge.scene.Module
import com.soywiz.korge.scene.Scene
import com.soywiz.korinject.AsyncInjector
import scenes.*
import kotlin.reflect.KClass

suspend fun main() = Korge(Korge.Config(module = MyModule))

object MyModule : Module() {
	override val mainScene: KClass<out Scene> = Scene1::class

	override suspend fun AsyncInjector.configure(): Unit {
		mapInstance(MyDependency("HELLO WORLD"))
		mapPrototype { Scene1(get()) }
		mapPrototype { Scene2(get()) }
	}
}
