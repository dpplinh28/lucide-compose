package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Inbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                lineTo(16f, 12f)
                lineTo(14f, 15f)
                lineTo(10f, 15f)
                lineTo(8f, 12f)
                lineTo(2f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.45f, 5.11f)
                lineTo(2f, 12f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-6f)
                lineToRelative(-3.45f, -6.89f)
                arcTo(2f, 2f, 0f, false, false, 16.76f, 4f)
                horizontalLineTo(7.24f)
                arcToRelative(2f, 2f, 0f, false, false, -1.79f, 1.11f)
                close()
            }
}

public val LucideIcons.All.InboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Inbox: ImageVector
    @Composable get() = InboxDefinition.asImageVector()
