package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(6.292f)
                arcToRelative(7f, 7f, 0f, true, false, 4f, 0f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 15f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 2f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.FlaskRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskRound: ImageVector
    @Composable get() = FlaskRoundDefinition.asImageVector()
