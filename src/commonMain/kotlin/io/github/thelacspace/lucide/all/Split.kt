package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Split") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                horizontalLineTo(3f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-8.3f)
                arcToRelative(4f, 4f, 0f, false, false, -1.172f, -2.872f)
                lineTo(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 9f)
                lineToRelative(6f, -6f)
            }
}

public val LucideIcons.All.SplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Split: ImageVector
    @Composable get() = SplitDefinition.asImageVector()
