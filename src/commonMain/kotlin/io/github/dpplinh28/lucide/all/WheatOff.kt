package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WheatOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 22f)
                lineToRelative(10f, -10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 8f)
                lineToRelative(-1.17f, 1.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.47f, 12.53f)
                lineTo(5f, 11f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(5f, 19f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 8f)
                lineToRelative(-.53f, .53f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 4.94f)
                lineTo(9f, 15f)
                lineToRelative(1.53f, -1.53f)
                curveToRelative(.55f, -.55f, .88f, -1.25f, .98f, -1.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.91f, 5.26f)
                curveToRelative(.15f, -.26f, .34f, -.51f, .56f, -.73f)
                lineTo(13f, 3f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, .28f, 4.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.47f, 17.47f)
                lineTo(13f, 19f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(5f, 19f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 16f)
                lineToRelative(-.53f, .53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(9f, 15f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.49f, 3.49f, 0f, false, true, 1.97f, -.98f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.74f, 13.09f)
                curveToRelative(.26f, -.15f, .51f, -.34f, .73f, -.56f)
                lineTo(21f, 11f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -4.62f, -.28f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.WheatOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WheatOff: ImageVector
    @Composable get() = WheatOffDefinition.asImageVector()
