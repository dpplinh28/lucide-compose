package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beef") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.4f, 13.7f)
                arcTo(6.5f, 6.5f, 0f, true, false, 6.28f, 6.6f)
                curveToRelative(-1.1f, 3.13f, -.78f, 3.9f, -3.18f, 6.08f)
                arcTo(3f, 3f, 0f, false, false, 5f, 18f)
                curveToRelative(4f, 0f, 8.4f, -1.8f, 11.4f, -4.3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.5f, 6f)
                lineToRelative(2.19f, 4.5f)
                arcToRelative(6.48f, 6.48f, 0f, false, true, -2.29f, 7.2f)
                curveTo(15.4f, 20.2f, 11f, 22f, 7f, 22f)
                arcToRelative(3f, 3f, 0f, false, true, -2.68f, -1.66f)
                lineTo(2.4f, 16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
}

public val LucideIcons.All.BeefDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beef: ImageVector
    @Composable get() = BeefDefinition.asImageVector()
