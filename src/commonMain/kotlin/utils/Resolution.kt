// From https://github.com/TobseF/MagicMaze-Island
package utils

import com.soywiz.korma.geom.Point

data class Resolution(val width: Int, val height: Int) {
    fun center() = Point(width / 2, height / 2)
}