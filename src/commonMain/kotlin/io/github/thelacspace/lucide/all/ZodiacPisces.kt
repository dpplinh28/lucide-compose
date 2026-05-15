package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacPisces") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                arcToRelative(15f, 15f, 0f, false, true, 0f, -18f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 3f)
                arcToRelative(15f, 15f, 0f, false, true, 0f, 18f)
            }
}

public val LucideIcons.All.ZodiacPiscesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacPisces: ImageVector
    @Composable get() = ZodiacPiscesDefinition.asImageVector()
