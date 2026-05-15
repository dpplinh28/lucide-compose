package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PenTool") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.707f, 21.293f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, 0f)
                lineToRelative(-1.586f, -1.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                lineToRelative(5.586f, -5.586f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(1.586f, 1.586f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 13f)
                lineToRelative(-1.375f, -6.874f)
                arcToRelative(1f, 1f, 0f, false, false, -.746f, -.776f)
                lineTo(3.235f, 2.028f)
                arcToRelative(1f, 1f, 0f, false, false, -1.207f, 1.207f)
                lineTo(5.35f, 15.879f)
                arcToRelative(1f, 1f, 0f, false, false, .776f, .746f)
                lineTo(13f, 18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2.3f, 2.3f)
                lineToRelative(7.286f, 7.286f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.PenToolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PenTool: ImageVector
    @Composable get() = PenToolDefinition.asImageVector()
