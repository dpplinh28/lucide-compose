package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileStack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 21f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, -.586f, -1.414f)
                lineToRelative(-2f, -2f)
                arcTo(2f, 2f, 0f, false, false, 17f, 2f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
}

public val LucideIcons.All.FileStackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileStack: ImageVector
    @Composable get() = FileStackDefinition.asImageVector()
