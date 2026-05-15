package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.3f, 15f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-1.9f, -1.9f)
            }
}

public val LucideIcons.All.UserSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserSearch: ImageVector
    @Composable get() = UserSearchDefinition.asImageVector()
