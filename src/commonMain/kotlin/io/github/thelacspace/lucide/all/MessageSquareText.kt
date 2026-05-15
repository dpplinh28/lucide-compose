package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareText") { strokeWidth ->
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
                moveTo(7f, 11f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 15f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 7f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.MessageSquareTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareText: ImageVector
    @Composable get() = MessageSquareTextDefinition.asImageVector()
