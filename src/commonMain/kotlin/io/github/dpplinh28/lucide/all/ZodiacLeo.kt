package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacLeo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                curveToRelative(0f, -4f, -3f, -4.5f, -3f, -8f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
                curveToRelative(0f, 3.466f, -3f, 6.196f, -3f, 10f)
                arcToRelative(3f, 3f, 0f, false, false, 6f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.ZodiacLeoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacLeo: ImageVector
    @Composable get() = ZodiacLeoDefinition.asImageVector()
