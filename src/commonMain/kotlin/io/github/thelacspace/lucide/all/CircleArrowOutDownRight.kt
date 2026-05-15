package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutDownRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                arcToRelative(10f, 10f, 0f, true, true, 10f, -10f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 22f)
                lineTo(12f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
            }
}

public val LucideIcons.All.CircleArrowOutDownRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutDownRight: ImageVector
    @Composable get() = CircleArrowOutDownRightDefinition.asImageVector()
