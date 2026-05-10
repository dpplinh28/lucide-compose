package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(3.293f)
                arcToRelative(.707f, .707f, 0f, false, true, .5f, 1.207f)
                lineToRelative(-7.086f, 7.086f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-7.086f, -7.086f)
                arcToRelative(.707f, .707f, 0f, false, true, .5f, -1.207f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
}

public val LucideIcons.All.ArrowBigDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigDown: ImageVector
    @Composable get() = ArrowBigDownDefinition.asImageVector()
