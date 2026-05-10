package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LensConvex") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.433f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, .824f, .448f)
                arcToRelative(18f, 18f, 0f, false, true, 0f, 19.104f)
                arcToRelative(1f, 1f, 0f, false, true, -.824f, .448f)
                horizontalLineToRelative(-2.866f)
                arcToRelative(1f, 1f, 0f, false, true, -.824f, -.448f)
                arcToRelative(18f, 18f, 0f, false, true, 0f, -19.104f)
                arcTo(1f, 1f, 0f, false, true, 10.567f, 2f)
                close()
            }
}

public val LucideIcons.All.LensConvexDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LensConvex: ImageVector
    @Composable get() = LensConvexDefinition.asImageVector()
