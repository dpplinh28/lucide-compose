package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LogOut") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 17f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
            }
}

public val LucideIcons.All.LogOutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LogOut: ImageVector
    @Composable get() = LogOutDefinition.asImageVector()
