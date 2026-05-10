package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Users") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 21f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3.128f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 7.744f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 21f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, -3f, -3.87f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
}

public val LucideIcons.All.UsersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Users: ImageVector
    @Composable get() = UsersDefinition.asImageVector()
