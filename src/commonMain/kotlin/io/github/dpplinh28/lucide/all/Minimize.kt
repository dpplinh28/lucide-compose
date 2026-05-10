package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Minimize") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 16f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 21f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
            }
}

public val LucideIcons.All.MinimizeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Minimize: ImageVector
    @Composable get() = MinimizeDefinition.asImageVector()
