package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareWarning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6.828f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, .586f)
                lineToRelative(-2.202f, 2.202f)
                arcTo(.71f, .71f, 0f, false, true, 2f, 21.286f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 15f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.MessageSquareWarningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareWarning: ImageVector
    @Composable get() = MessageSquareWarningDefinition.asImageVector()
