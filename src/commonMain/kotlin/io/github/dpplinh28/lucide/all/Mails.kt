package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mails") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 19f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, 1f, -1.732f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 5.5f)
                lineToRelative(-6.419f, 4.179f)
                arcToRelative(2f, 2f, 0f, false, true, -2.162f, 0f)
                lineTo(7f, 5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MailsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mails: ImageVector
    @Composable get() = MailsDefinition.asImageVector()
