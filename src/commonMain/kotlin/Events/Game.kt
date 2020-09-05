package Events

import utils.PositionGrid.Position

/**
 * Triggered after a new score value
 */
data class NewScoreEvent(val score: Int, val multiplicator: Int = 1, val pos: Position)

object GameOverEvent

object ResetGameEvent

object NextLevelEvent

data class ChangePlayerEvent(val playerId: Int = 0)

object OpenSettingsEvent

object OpenFaqEvent

data class ChangeLevelEvent(val roomName: String)
