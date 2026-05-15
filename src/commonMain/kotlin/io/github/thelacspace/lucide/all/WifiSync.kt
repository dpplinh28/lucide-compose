package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.965f, 10.105f)
                verticalLineToRelative(4f)
                lineTo(13.5f, 12.5f)
                arcToRelative(5f, 5f, 0f, false, true, 8f, 1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.965f, 14.105f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.965f, 18.105f)
                horizontalLineToRelative(4f)
                lineTo(20.43f, 19.71f)
                arcToRelative(5f, 5f, 0f, false, true, -8f, -1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8.82f)
                arcToRelative(15f, 15f, 0f, false, true, 20f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.965f, 22.105f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 12.86f)
                arcToRelative(10f, 10f, 0f, false, true, 3f, -2.032f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 16.429f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.WifiSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiSync: ImageVector
    @Composable get() = WifiSyncDefinition.asImageVector()
