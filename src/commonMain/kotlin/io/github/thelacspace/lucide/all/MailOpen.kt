package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.2f, 8.4f)
                curveToRelative(.5f, .38f, .8f, .97f, .8f, 1.6f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, false, true, .8f, -1.6f)
                lineToRelative(8f, -6f)
                arcToRelative(2f, 2f, 0f, false, true, 2.4f, 0f)
                lineToRelative(8f, 6f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 10f)
                lineToRelative(-8.97f, 5.7f)
                arcToRelative(1.94f, 1.94f, 0f, false, true, -2.06f, 0f)
                lineTo(2f, 10f)
            }
}

public val LucideIcons.All.MailOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailOpen: ImageVector
    @Composable get() = MailOpenDefinition.asImageVector()
