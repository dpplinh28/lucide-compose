package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigUpDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(3.293f)
                arcToRelative(.707f, .707f, 0f, false, false, .5f, -1.207f)
                lineToRelative(-6.939f, -6.939f)
                arcToRelative(1.207f, 1.207f, 0f, false, false, -1.708f, 0f)
                lineToRelative(-6.94f, 6.94f)
                arcToRelative(.707f, .707f, 0f, false, false, .5f, 1.206f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 20f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.ArrowBigUpDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigUpDash: ImageVector
    @Composable get() = ArrowBigUpDashDefinition.asImageVector()
