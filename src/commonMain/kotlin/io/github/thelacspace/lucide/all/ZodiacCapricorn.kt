package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacCapricorn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 21f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(6.5f)
                arcToRelative(1f, 1f, 0f, false, false, -7f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 19f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineToRelative(0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.ZodiacCapricornDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacCapricorn: ImageVector
    @Composable get() = ZodiacCapricornDefinition.asImageVector()
