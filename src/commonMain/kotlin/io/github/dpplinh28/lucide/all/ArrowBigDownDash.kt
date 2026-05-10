package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigDownDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3.293f)
                arcToRelative(.707f, .707f, 0f, false, true, .5f, 1.207f)
                lineToRelative(-6.939f, 6.939f)
                arcToRelative(1.207f, 1.207f, 0f, false, true, -1.708f, 0f)
                lineToRelative(-6.94f, -6.94f)
                arcToRelative(.707f, .707f, 0f, false, true, .5f, -1.206f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.ArrowBigDownDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigDownDash: ImageVector
    @Composable get() = ArrowBigDownDashDefinition.asImageVector()
