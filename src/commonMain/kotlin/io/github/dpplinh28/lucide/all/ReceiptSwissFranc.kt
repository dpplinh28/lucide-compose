package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReceiptSwissFranc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 11f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 17f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
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
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(5f)
            }
}

public val LucideIcons.All.ReceiptSwissFrancDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReceiptSwissFranc: ImageVector
    @Composable get() = ReceiptSwissFrancDefinition.asImageVector()
