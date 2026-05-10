package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.793f, 19.793f)
                arcToRelative(.707f, .707f, 0f, false, false, 1.207f, -.5f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4.707f)
                arcToRelative(.707f, .707f, 0f, false, false, -1.207f, -.5f)
                lineToRelative(-6.94f, 6.94f)
                arcToRelative(1.207f, 1.207f, 0f, false, false, 0f, 1.707f)
                close()
            }
}

public val LucideIcons.All.ArrowBigLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigLeft: ImageVector
    @Composable get() = ArrowBigLeftDefinition.asImageVector()
