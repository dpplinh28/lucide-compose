package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WandSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(21.64f, 3.64f)
                lineToRelative(-1.28f, -1.28f)
                arcToRelative(1.21f, 1.21f, 0f, false, false, -1.72f, 0f)
                lineTo(2.36f, 18.64f)
                arcToRelative(1.21f, 1.21f, 0f, false, false, 0f, 1.72f)
                lineToRelative(1.28f, 1.28f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 1.72f, 0f)
                lineTo(21.64f, 5.36f)
                arcToRelative(1.2f, 1.2f, 0f, false, false, 0f, -1.72f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 7f)
                lineToRelative(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 6f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 14f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 8f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 16f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 3f)
                horizontalLineTo(9f)
            }
}

public val LucideIcons.All.WandSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WandSparkles: ImageVector
    @Composable get() = WandSparklesDefinition.asImageVector()
