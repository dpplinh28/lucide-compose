package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Clover") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.17f, 7.83f)
                lineTo(2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.02f, 12f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, 3.81f, -4.17f)
                arcTo(2.827f, 2.827f, 0f, true, true, 12f, 4.02f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, 4.17f, 3.81f)
                arcTo(2.827f, 2.827f, 0f, true, true, 19.98f, 12f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, -3.81f, 4.17f)
                arcTo(2.827f, 2.827f, 0f, true, true, 12f, 19.98f)
                arcToRelative(2.827f, 2.827f, 0f, true, true, -4.17f, -3.81f)
                arcTo(1f, 1f, 0f, true, true, 4f, 12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.83f, 7.83f)
                lineToRelative(8.34f, 8.34f)
            }
}

public val LucideIcons.All.CloverDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Clover: ImageVector
    @Composable get() = CloverDefinition.asImageVector()
