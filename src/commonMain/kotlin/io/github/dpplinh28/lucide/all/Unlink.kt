package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unlink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(18.84f, 12.25f)
                lineToRelative(1.72f, -1.71f)
                horizontalLineToRelative(-.02f)
                arcToRelative(5.004f, 5.004f, 0f, false, false, -.12f, -7.07f)
                arcToRelative(5.006f, 5.006f, 0f, false, false, -6.95f, 0f)
                lineToRelative(-1.72f, 1.71f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.17f, 11.75f)
                lineToRelative(-1.71f, 1.71f)
                arcToRelative(5.004f, 5.004f, 0f, false, false, .12f, 7.07f)
                arcToRelative(5.006f, 5.006f, 0f, false, false, 6.95f, 0f)
                lineToRelative(1.71f, -1.71f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                lineTo(8f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8f)
                lineTo(5f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 19f)
                lineTo(16f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                lineTo(22f, 16f)
            }
}

public val LucideIcons.All.UnlinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unlink: ImageVector
    @Composable get() = UnlinkDefinition.asImageVector()
