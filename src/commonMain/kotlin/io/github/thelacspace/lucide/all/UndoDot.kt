package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UndoDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                arcToRelative(9f, 9f, 0f, false, false, -15f, -6.7f)
                lineTo(3f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.UndoDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UndoDot: ImageVector
    @Composable get() = UndoDotDefinition.asImageVector()
