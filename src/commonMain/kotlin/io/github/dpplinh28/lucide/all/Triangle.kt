package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Triangle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.73f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, -3.46f, 0f)
                lineToRelative(-8f, 14f)
                arcTo(2f, 2f, 0f, false, false, 4f, 21f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 1.73f, -3f)
                close()
            }
}

public val LucideIcons.All.TriangleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Triangle: ImageVector
    @Composable get() = TriangleDefinition.asImageVector()
