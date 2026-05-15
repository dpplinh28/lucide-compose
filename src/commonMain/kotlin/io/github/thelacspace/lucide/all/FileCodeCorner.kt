package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileCodeCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 12.15f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, 1.706f, .706f)
                lineToRelative(3.588f, 3.588f)
                arcTo(2.4f, 2.4f, 0f, false, true, 20f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-3.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 16f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 22f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
}

public val LucideIcons.All.FileCodeCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileCodeCorner: ImageVector
    @Composable get() = FileCodeCornerDefinition.asImageVector()
