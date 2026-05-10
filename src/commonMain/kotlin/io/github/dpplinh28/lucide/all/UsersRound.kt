package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UsersRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 21f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 20f)
                curveToRelative(0f, -3.37f, -2f, -6.5f, -4f, -8f)
                arcToRelative(5f, 5f, 0f, false, false, -.45f, -8.3f)
            }
}

public val LucideIcons.All.UsersRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UsersRound: ImageVector
    @Composable get() = UsersRoundDefinition.asImageVector()
