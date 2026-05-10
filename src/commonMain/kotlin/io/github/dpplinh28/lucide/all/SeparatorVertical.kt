package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SeparatorVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 16f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 8f)
                lineToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.SeparatorVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SeparatorVertical: ImageVector
    @Composable get() = SeparatorVerticalDefinition.asImageVector()
