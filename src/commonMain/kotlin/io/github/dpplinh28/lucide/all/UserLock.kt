package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f, 15f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.899f, 16.0f)
                horizontalLineToRelative(6.202f)
                arcToRelative(0.899f, 0.0f, 0f, false, true, 0.899f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.899f, 0.0f, 0f, false, true, -0.899f, 0.0f)
                horizontalLineToRelative(-6.202f)
                arcToRelative(0.899f, 0.0f, 0f, false, true, -0.899f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.899f, 0.0f, 0f, false, true, 0.899f, -0.0f)
                close()
            }
}

public val LucideIcons.All.UserLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserLock: ImageVector
    @Composable get() = UserLockDefinition.asImageVector()
