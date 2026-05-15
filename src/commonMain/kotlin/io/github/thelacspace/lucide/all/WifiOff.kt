package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 16.429f)
                arcToRelative(5f, 5f, 0f, false, true, 7f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 12.859f)
                arcToRelative(10f, 10f, 0f, false, true, 5.17f, -2.69f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 12.859f)
                arcToRelative(10f, 10f, 0f, false, false, -2.007f, -1.523f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8.82f)
                arcToRelative(15f, 15f, 0f, false, true, 4.177f, -2.643f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 8.82f)
                arcToRelative(15f, 15f, 0f, false, false, -11.288f, -3.764f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.WifiOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiOff: ImageVector
    @Composable get() = WifiOffDefinition.asImageVector()
