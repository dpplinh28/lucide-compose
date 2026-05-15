package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareHeart") { strokeWidth ->
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
                moveTo(7.5f, 9.5f)
                curveToRelative(0f, .687f, .265f, 1.383f, .697f, 1.844f)
                lineToRelative(3.009f, 3.264f)
                arcToRelative(1.14f, 1.14f, 0f, false, false, .407f, .314f)
                arcToRelative(1f, 1f, 0f, false, false, .783f, -.004f)
                arcToRelative(1.14f, 1.14f, 0f, false, false, .398f, -.31f)
                lineToRelative(3.008f, -3.264f)
                arcTo(2.77f, 2.77f, 0f, false, false, 16.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 12f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -4.5f, 1.5f)
            }
}

public val LucideIcons.All.MessageSquareHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareHeart: ImageVector
    @Composable get() = MessageSquareHeartDefinition.asImageVector()
