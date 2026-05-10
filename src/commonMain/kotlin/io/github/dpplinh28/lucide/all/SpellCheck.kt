package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SpellCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(6f, 16f)
                lineToRelative(6f, -12f)
                lineToRelative(6f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 20f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
}

public val LucideIcons.All.SpellCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SpellCheck: ImageVector
    @Composable get() = SpellCheckDefinition.asImageVector()
