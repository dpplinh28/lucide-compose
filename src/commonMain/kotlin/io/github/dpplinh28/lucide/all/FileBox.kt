package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.5f, 22f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -.706f, -1.706f)
                lineToRelative(-3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 14f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.7f, 14.2f)
                lineTo(7f, 17f)
                lineToRelative(-4.7f, -2.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 13.1f)
                arcToRelative(2f, 2f, 0f, false, false, -.999f, 1.76f)
                verticalLineToRelative(3.24f)
                arcToRelative(2f, 2f, 0f, false, false, .969f, 1.78f)
                lineTo(6f, 21.7f)
                arcToRelative(2f, 2f, 0f, false, false, 2.03f, .01f)
                lineTo(11f, 19.9f)
                arcToRelative(2f, 2f, 0f, false, false, 1f, -1.76f)
                verticalLineTo(14.9f)
                arcToRelative(2f, 2f, 0f, false, false, -.97f, -1.78f)
                lineTo(8f, 11.3f)
                arcToRelative(2f, 2f, 0f, false, false, -2.03f, -.01f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.FileBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBox: ImageVector
    @Composable get() = FileBoxDefinition.asImageVector()
