package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownToDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 9f)
                lineToRelative(-7f, 7f)
                lineToRelative(-7f, -7f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.ArrowDownToDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownToDot: ImageVector
    @Composable get() = ArrowDownToDotDefinition.asImageVector()
