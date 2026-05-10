package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampDesk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(5.994f, 1.227f)
                arcToRelative(1f, 1f, 0f, false, true, .506f, 1.687f)
                lineToRelative(-7f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, -1.687f, -.506f)
                lineToRelative(-1.227f, -5.994f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.414f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.207f, 4.793f)
                lineToRelative(-3.414f, 3.414f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.086f, 6.5f)
                lineToRelative(-4.793f, 4.793f)
                arcToRelative(1f, 1f, 0f, false, false, -.18f, 1.17f)
                lineTo(7f, 18f)
            }
}

public val LucideIcons.All.LampDeskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampDesk: ImageVector
    @Composable get() = LampDeskDefinition.asImageVector()
