package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Receipt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 8f)
                horizontalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, .7f, .2f)
                lineToRelative(.933f, .6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, 1.4f, 0f)
                lineToRelative(.934f, -.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, 1.4f, 0f)
                lineToRelative(.933f, .6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, 1.4f, 0f)
                lineToRelative(.933f, -.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, 1.4f, 0f)
                lineToRelative(.934f, .6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, 1.4f, 0f)
                lineToRelative(.933f, -.6f)
                arcTo(1.3f, 1.3f, 0f, false, true, 19f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -.7f, -.2f)
                lineToRelative(-.933f, -.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-.934f, .6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -1.4f, 0f)
                lineToRelative(-.933f, -.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-.933f, .6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -1.4f, 0f)
                lineToRelative(-.934f, -.6f)
                arcToRelative(1.3f, 1.3f, 0f, false, false, -1.4f, 0f)
                lineToRelative(-.933f, .6f)
                arcToRelative(1.3f, 1.3f, 0f, false, true, -.7f, .2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
}

public val LucideIcons.All.ReceiptDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Receipt: ImageVector
    @Composable get() = ReceiptDefinition.asImageVector()
