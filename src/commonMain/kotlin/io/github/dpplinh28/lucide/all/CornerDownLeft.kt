package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 4f)
                verticalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 10f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
            }
}

public val LucideIcons.All.CornerDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerDownLeft: ImageVector
    @Composable get() = CornerDownLeftDefinition.asImageVector()
