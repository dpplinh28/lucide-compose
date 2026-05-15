package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 8.82f)
                arcToRelative(15f, 15f, 0f, false, true, 20f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378f, 16.626f)
                arcToRelative(1f, 1f, 0f, false, false, -3.004f, -3.004f)
                lineToRelative(-4.01f, 4.012f)
                arcToRelative(2f, 2f, 0f, false, false, -.506f, .854f)
                lineToRelative(-.837f, 2.87f)
                arcToRelative(.5f, .5f, 0f, false, false, .62f, .62f)
                lineToRelative(2.87f, -.837f)
                arcToRelative(2f, 2f, 0f, false, false, .854f, -.506f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 12.859f)
                arcToRelative(10f, 10f, 0f, false, true, 10.5f, -2.222f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 16.429f)
                arcToRelative(5f, 5f, 0f, false, true, 3f, -1.406f)
            }
}

public val LucideIcons.All.WifiPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiPen: ImageVector
    @Composable get() = WifiPenDefinition.asImageVector()
