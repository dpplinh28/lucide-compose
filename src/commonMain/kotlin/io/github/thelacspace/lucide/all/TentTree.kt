package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TentTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 5f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 10f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 14f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 14f)
                horizontalLineTo(7f)
                lineToRelative(-5f, 8f)
                horizontalLineToRelative(20f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 14f)
                lineToRelative(5f, 8f)
            }
}

public val LucideIcons.All.TentTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TentTree: ImageVector
    @Composable get() = TentTreeDefinition.asImageVector()
