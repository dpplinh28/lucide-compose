package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mailbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(9.5f)
                curveTo(2f, 7f, 4f, 5f, 6.5f, 5f)
                horizontalLineTo(18f)
                curveToRelative(2.2f, 0f, 4f, 1.8f, 4f, 4f)
                verticalLineToRelative(8f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                lineTo(18f, 9f)
                lineTo(18f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f, 5f)
                curveTo(9f, 5f, 11f, 7f, 11f, 9.5f)
                verticalLineTo(17f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 10f)
                lineTo(7f, 10f)
            }
}

public val LucideIcons.All.MailboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mailbox: ImageVector
    @Composable get() = MailboxDefinition.asImageVector()
