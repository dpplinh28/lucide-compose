package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReceiptRussianRuble") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveTo(8f, 11f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(5f)
            }
}

public val LucideIcons.All.ReceiptRussianRubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReceiptRussianRuble: ImageVector
    @Composable get() = ReceiptRussianRubleDefinition.asImageVector()
