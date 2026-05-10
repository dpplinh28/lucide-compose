package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacVirgo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, true, 5f, 0f)
                verticalLineTo(16f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 11.5f)
                arcToRelative(1f, 1f, 0f, false, true, 5f, 0f)
                verticalLineTo(16f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 19f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, true, 5f, 0f)
                verticalLineTo(19f)
            }
}

public val LucideIcons.All.ZodiacVirgoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacVirgo: ImageVector
    @Composable get() = ZodiacVirgoDefinition.asImageVector()
