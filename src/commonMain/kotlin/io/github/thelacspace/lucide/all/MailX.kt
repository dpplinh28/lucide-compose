package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 13f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 7f)
                lineToRelative(-8.97f, 5.7f)
                arcToRelative(1.94f, 1.94f, 0f, false, true, -2.06f, 0f)
                lineTo(2f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 17f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 17f)
                lineToRelative(-4f, 4f)
            }
}

public val LucideIcons.All.MailXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailX: ImageVector
    @Composable get() = MailXDefinition.asImageVector()
