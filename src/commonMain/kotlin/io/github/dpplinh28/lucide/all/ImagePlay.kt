package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImagePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 15.003f)
                arcToRelative(1f, 1f, 0f, false, true, 1.517f, -.859f)
                lineToRelative(4.997f, 2.997f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.718f)
                lineToRelative(-4.997f, 2.997f)
                arcToRelative(1f, 1f, 0f, false, true, -1.517f, -.86f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12.17f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 21f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ImagePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImagePlay: ImageVector
    @Composable get() = ImagePlayDefinition.asImageVector()
