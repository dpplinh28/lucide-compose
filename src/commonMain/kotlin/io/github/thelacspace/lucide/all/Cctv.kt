package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cctv") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.75f, 12f)
                horizontalLineToRelative(3.632f)
                arcToRelative(1f, 1f, 0f, false, true, .894f, 1.447f)
                lineToRelative(-2.034f, 4.069f)
                arcToRelative(1f, 1f, 0f, false, true, -1.708f, .134f)
                lineToRelative(-2.124f, -2.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.106f, 9.053f)
                arcToRelative(1f, 1f, 0f, false, true, .447f, 1.341f)
                lineToRelative(-3.106f, 6.211f)
                arcToRelative(1f, 1f, 0f, false, true, -1.342f, .447f)
                lineTo(3.61f, 12.3f)
                arcToRelative(2.92f, 2.92f, 0f, false, true, -1.3f, -3.91f)
                lineTo(3.69f, 5.6f)
                arcToRelative(2.92f, 2.92f, 0f, false, true, 3.92f, -1.3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 19f)
                horizontalLineToRelative(3.76f)
                arcToRelative(2f, 2f, 0f, false, false, 1.8f, -1.1f)
                lineTo(9f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 9f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CctvDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cctv: ImageVector
    @Composable get() = CctvDefinition.asImageVector()
