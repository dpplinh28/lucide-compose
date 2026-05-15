package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RefreshCcw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
                arcToRelative(9.75f, 9.75f, 0f, false, false, -6.74f, 2.74f)
                lineTo(3f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                arcToRelative(9.75f, 9.75f, 0f, false, false, 6.74f, -2.74f)
                lineTo(21f, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.RefreshCcwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RefreshCcw: ImageVector
    @Composable get() = RefreshCcwDefinition.asImageVector()
