package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Angry") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                reflectiveCurveToRelative(-1.5f, -2f, -4f, -2f)
                reflectiveCurveToRelative(-4f, 2f, -4f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 8f)
                lineTo(10f, 9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 9f)
                lineToRelative(2.5f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.AngryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Angry: ImageVector
    @Composable get() = AngryDefinition.asImageVector()
