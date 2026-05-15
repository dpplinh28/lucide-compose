package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Presentation") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 3f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 3f)
                verticalLineToRelative(11f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 21f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
            }
}

public val LucideIcons.All.PresentationDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Presentation: ImageVector
    @Composable get() = PresentationDefinition.asImageVector()
