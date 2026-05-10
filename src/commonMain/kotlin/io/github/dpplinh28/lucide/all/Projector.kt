package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Projector") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 7f)
                lineTo(3f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 6f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 7f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.83f, 12f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.ProjectorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Projector: ImageVector
    @Composable get() = ProjectorDefinition.asImageVector()
