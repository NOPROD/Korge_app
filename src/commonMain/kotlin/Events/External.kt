package Events

data class InputEvent(val action: Action,
                      val heroNumber: Int = 0,
                      val roomId: Int? = null,
                      val isNetworkEvent: Boolean = false) {

    enum class Action {
        MapMoveUp, MapMoveDown, MapMoveLeft, MapMoveRight, MapZoomIn, MapZoomOut, SelectHero, HeroLeft, HeroRight, HeroUp, HeroDown, ActionSearch, FoundNextRoom, Unknown;

        companion object {
            fun parseValue(actioName: String): Action {
                return try {
                    valueOf(actioName)
                } catch (e: Exception) {
                    Unknown
                }
            }
        }
    }

    fun isLocalEvent() = !isNetworkEvent
}