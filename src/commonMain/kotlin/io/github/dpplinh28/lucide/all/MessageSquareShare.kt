package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareShare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(16.286f)
                arcToRelative(.71f, .71f, 0f, false, false, 1.212f, .502f)
                lineToRelative(2.202f, -2.202f)
                arcTo(2f, 2f, 0f, false, true, 6.828f, 19f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 9f)
                lineToRelative(6f, -6f)
            }
}

public val LucideIcons.All.MessageSquareShareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareShare: ImageVector
    @Composable get() = MessageSquareShareDefinition.asImageVector()
