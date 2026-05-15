package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 15f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 7f)
                lineToRelative(-8.97f, 5.7f)
                arcToRelative(1.94f, 1.94f, 0f, false, true, -2.06f, 0f)
                lineTo(2f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.MailMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailMinus: ImageVector
    @Composable get() = MailMinusDefinition.asImageVector()
