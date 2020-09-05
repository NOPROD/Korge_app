// Inspired From https://github.com/TobseF/MagicMaze-Island
package utils

import com.soywiz.korim.bitmap.Bitmap
import com.soywiz.korim.bitmap.BmpSlice
import com.soywiz.korim.font.BitmapFont
import com.soywiz.korim.font.readBitmapFont
import com.soywiz.korim.format.readBitmap
import com.soywiz.korinject.AsyncDependency
import com.soywiz.korinject.AsyncInjector
import com.soywiz.korio.file.std.resourcesVfs

suspend fun loadFont(fileName: String): BitmapFont = resourcesVfs["fonts/$fileName"].readBitmapFont()
suspend fun loadImage(fileName: String): Bitmap = resourcesVfs["images/$fileName"].readBitmap()

class Resources : AsyncDependency {


    lateinit var fontSmall: BitmapFont
    lateinit var player1: BmpSlice
    lateinit var player2: BmpSlice
    lateinit var player3: BmpSlice
    lateinit var player1_Selected: BmpSlice
    lateinit var player2_Selected: BmpSlice
    lateinit var player3_Selected: BmpSlice


    lateinit var uiPlayer1: BmpSlice
    lateinit var uiPlayer2: BmpSlice
    lateinit var uiPlayer3: BmpSlice
    lateinit var uiPlayer4: BmpSlice


    lateinit var uiCheckDisabled: BmpSlice
    lateinit var uiCheckEnabled: BmpSlice
    lateinit var uiPanelBottomLeft: BmpSlice
    lateinit var uiPanelTopLeft: BmpSlice
    lateinit var uiPanelTopRight: BmpSlice
    lateinit var uiPanelTopCenter: BmpSlice

    lateinit var buttonSettings: BmpSlice
    lateinit var buttonInfo: BmpSlice

    lateinit var helpPage1: BmpSlice
    lateinit var helpPage2: BmpSlice
    lateinit var helpPage3: BmpSlice




    lateinit var info: BmpSlice

    lateinit var borderLeft: BmpSlice
    lateinit var borderRight: BmpSlice
    lateinit var borderTop: BmpSlice
    lateinit var borderBottom: BmpSlice


    lateinit var asset1: BmpSlice
    lateinit var asset2: BmpSlice
    lateinit var asset3: BmpSlice
    lateinit var asset4: BmpSlice
    lateinit var asset5: BmpSlice
    lateinit var asset6: BmpSlice
    lateinit var asset7: BmpSlice


    lateinit var uiActionSearch: BmpSlice

    companion object {
        operator fun invoke(injector: AsyncInjector) {
            injector.mapSingleton { Resources() }
        }
    }
    override suspend fun init() {}

}