package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Handshake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(11f, 17f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, true, false, 3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 14f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1f, 1f, 0f, true, false, 3f, -3f)
                lineToRelative(-3.88f, -3.88f)
                arcToRelative(3f, 3f, 0f, false, false, -4.24f, 0f)
                lineToRelative(-.88f, .88f)
                arcToRelative(1f, 1f, 0f, true, true, -3f, -3f)
                lineToRelative(2.81f, -2.81f)
                arcToRelative(5.79f, 5.79f, 0f, false, true, 7.06f, -.87f)
                lineToRelative(.47f, .28f)
                arcToRelative(2f, 2f, 0f, false, false, 1.42f, .25f)
                lineTo(21f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(1f, 11f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                lineTo(2f, 14f)
                lineToRelative(6.5f, 6.5f)
                arcToRelative(1f, 1f, 0f, true, false, 3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 4f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.HandshakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Handshake: ImageVector
    @Composable get() = HandshakeDefinition.asImageVector()
