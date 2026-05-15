package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextInitial") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 5f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 12f)
                lineToRelative(3.553f, -7.724f)
                arcToRelative(.5f, .5f, 0f, false, true, .894f, 0f)
                lineTo(11f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.92f, 10f)
                horizontalLineToRelative(6.16f)
            }
}

public val LucideIcons.All.TextInitialDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextInitial: ImageVector
    @Composable get() = TextInitialDefinition.asImageVector()
