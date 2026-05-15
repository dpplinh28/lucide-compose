package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Balloon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                curveToRelative(0f, 4f, -3.5f, 8f, -6f, 8f)
                reflectiveCurveToRelative(-6f, -4f, -6f, -8f)
                arcToRelative(6f, 6f, 0f, false, true, 12f, 0f)
            }
}

public val LucideIcons.All.BalloonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Balloon: ImageVector
    @Composable get() = BalloonDefinition.asImageVector()
