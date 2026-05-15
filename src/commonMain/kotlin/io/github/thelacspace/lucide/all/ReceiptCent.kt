package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReceiptCent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.828f, 14.829f)
                arcToRelative(4f, 4f, 0f, false, true, -5.656f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -5.657f)
                arcToRelative(4f, 4f, 0f, false, true, 5.656f, 0f)
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

public val LucideIcons.All.ReceiptCentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReceiptCent: ImageVector
    @Composable get() = ReceiptCentDefinition.asImageVector()
