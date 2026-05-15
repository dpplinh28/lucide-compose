package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PilcrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 9f)
                horizontalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                horizontalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 3f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 18f)
                horizontalLineTo(2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 22f)
                lineToRelative(-4f, -4f)
            }
}

public val LucideIcons.All.PilcrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PilcrowLeft: ImageVector
    @Composable get() = PilcrowLeftDefinition.asImageVector()
