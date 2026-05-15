package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaveAll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 18f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(9.172f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineToRelative(2.828f, 2.828f)
                arcTo(2f, 2f, 0f, false, true, 22f, 6.828f)
                verticalLineTo(16f)
                arcToRelative(2f, 2f, 0f, false, true, -2.01f, 2f)
                close()
            }
}

public val LucideIcons.All.SaveAllDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaveAll: ImageVector
    @Composable get() = SaveAllDefinition.asImageVector()
