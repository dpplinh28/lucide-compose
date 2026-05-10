package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrushCleaning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 22f)
                lineToRelative(-1f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 14f)
                horizontalLineTo(5f)
                lineToRelative(-1.973f, 6.767f)
                arcTo(1f, 1f, 0f, false, false, 4f, 22f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, false, false, .973f, -1.233f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 22f)
                lineToRelative(1f, -4f)
            }
}

public val LucideIcons.All.BrushCleaningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrushCleaning: ImageVector
    @Composable get() = BrushCleaningDefinition.asImageVector()
