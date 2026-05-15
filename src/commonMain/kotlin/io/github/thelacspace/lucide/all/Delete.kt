package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Delete") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.344f, .519f)
                lineToRelative(-6.328f, 5.74f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.481f)
                lineToRelative(6.328f, 5.741f)
                arcTo(2f, 2f, 0f, false, false, 10f, 19f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 9f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 9f)
                lineToRelative(-6f, 6f)
            }
}

public val LucideIcons.All.DeleteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Delete: ImageVector
    @Composable get() = DeleteDefinition.asImageVector()
