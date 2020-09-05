import com.soywiz.korge.Korge
import modules.MyModule

suspend fun main() = Korge(Korge.Config(module = MyModule, debug = false))