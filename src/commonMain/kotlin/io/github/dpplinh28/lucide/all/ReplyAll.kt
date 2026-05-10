package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReplyAll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 18f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                horizontalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 17f)
                lineToRelative(-5f, -5f)
                lineToRelative(5f, -5f)
            }
}

public val LucideIcons.All.ReplyAllDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReplyAll: ImageVector
    @Composable get() = ReplyAllDefinition.asImageVector()
