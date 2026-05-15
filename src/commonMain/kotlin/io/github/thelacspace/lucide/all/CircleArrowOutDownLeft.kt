package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                arcToRelative(10f, 10f, 0f, true, true, 10f, 10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 22f)
                lineToRelative(10f, -10f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineTo(2f)
                verticalLineToRelative(-6f)
            }
}

public val LucideIcons.All.CircleArrowOutDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutDownLeft: ImageVector
    @Composable get() = CircleArrowOutDownLeftDefinition.asImageVector()
