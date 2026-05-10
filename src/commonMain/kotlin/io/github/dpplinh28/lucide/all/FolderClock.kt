package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(2.2f)
                lineToRelative(1.6f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2f, 2f, 0f, false, true, 1.69f, .9f)
                lineToRelative(.81f, 1.2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.67f, .9f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.FolderClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderClock: ImageVector
    @Composable get() = FolderClockDefinition.asImageVector()
