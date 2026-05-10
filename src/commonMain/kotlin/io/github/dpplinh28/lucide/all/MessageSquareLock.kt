package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 8.5f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(16.286f)
                arcToRelative(.71f, .71f, 0f, false, false, 1.212f, .502f)
                lineToRelative(2.202f, -2.202f)
                arcTo(2f, 2f, 0f, false, true, 6.828f, 19f)
                horizontalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 15f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MessageSquareLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareLock: ImageVector
    @Composable get() = MessageSquareLockDefinition.asImageVector()
