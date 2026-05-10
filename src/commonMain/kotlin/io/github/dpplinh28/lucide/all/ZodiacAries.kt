package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacAries") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 5f, 4.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 5f, -4.5f)
                verticalLineTo(21f)
            }
}

public val LucideIcons.All.ZodiacAriesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacAries: ImageVector
    @Composable get() = ZodiacAriesDefinition.asImageVector()
