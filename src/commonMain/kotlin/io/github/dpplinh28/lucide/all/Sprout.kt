package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sprout") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 9.536f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(1.5f)
                arcToRelative(.5f, .5f, 0f, false, true, .5f, .5f)
                verticalLineTo(5f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                curveToRelative(0f, 2f, 1f, 3f, 1f, 5f)
                arcToRelative(5f, 5f, 0f, false, true, -1f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 9f)
                arcToRelative(5f, 5f, 0f, false, true, 8f, 4f)
                arcToRelative(5f, 5f, 0f, false, true, -8f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
}

public val LucideIcons.All.SproutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sprout: ImageVector
    @Composable get() = SproutDefinition.asImageVector()
