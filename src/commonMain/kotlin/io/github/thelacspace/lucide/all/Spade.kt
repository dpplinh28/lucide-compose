package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spade") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14.499f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 9.591f, 3.675f)
                arcToRelative(.6f, .6f, 0f, false, true, .818f, .001f)
                arcTo(5.5f, 5.5f, 0f, false, false, 22f, 14.5f)
                curveToRelative(0f, -2.29f, -1.5f, -4f, -3f, -5.5f)
                lineToRelative(-5.492f, -5.312f)
                arcToRelative(2f, 2f, 0f, false, false, -3f, -.02f)
                lineTo(5f, 8.999f)
                curveToRelative(-1.5f, 1.5f, -3f, 3.2f, -3f, 5.5f)
            }
}

public val LucideIcons.All.SpadeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spade: ImageVector
    @Composable get() = SpadeDefinition.asImageVector()
