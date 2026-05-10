package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18f, 9f)
                lineToRelative(-6f, -6f)
                lineToRelative(-6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.ArrowUpFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpFromLine: ImageVector
    @Composable get() = ArrowUpFromLineDefinition.asImageVector()
