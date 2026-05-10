package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(9f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 19f)
                verticalLineTo(5f)
            }
}

public val LucideIcons.All.ArrowLeftFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftFromLine: ImageVector
    @Composable get() = ArrowLeftFromLineDefinition.asImageVector()
