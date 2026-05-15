package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartColumn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 17f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 17f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 17f)
                verticalLineToRelative(-3f)
            }
}

public val LucideIcons.All.ChartColumnDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartColumn: ImageVector
    @Composable get() = ChartColumnDefinition.asImageVector()
