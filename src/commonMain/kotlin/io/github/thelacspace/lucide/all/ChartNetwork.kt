package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNetwork") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(13.11f, 7.664f)
                lineToRelative(1.78f, 2.672f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.162f, 12.788f)
                lineToRelative(-3.324f, 1.424f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 4f)
                lineToRelative(-6.06f, 1.515f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ChartNetworkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNetwork: ImageVector
    @Composable get() = ChartNetworkDefinition.asImageVector()
