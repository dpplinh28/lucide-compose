package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.375f, 2.625f)
                arcToRelative(1f, 1f, 0f, false, true, 3f, 3f)
                lineToRelative(-9.013f, 9.014f)
                arcToRelative(2f, 2f, 0f, false, true, -.853f, .505f)
                lineToRelative(-2.873f, .84f)
                arcToRelative(.5f, .5f, 0f, false, true, -.62f, -.62f)
                lineToRelative(.84f, -2.873f)
                arcToRelative(2f, 2f, 0f, false, true, .506f, -.852f)
                close()
            }
}

public val LucideIcons.All.SquarePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePen: ImageVector
    @Composable get() = SquarePenDefinition.asImageVector()
