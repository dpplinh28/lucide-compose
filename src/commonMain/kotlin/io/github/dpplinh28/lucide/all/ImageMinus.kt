package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                lineTo(22f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 15f)
                lineToRelative(-3.086f, -3.086f)
                arcToRelative(2f, 2f, 0f, false, false, -2.828f, 0f)
                lineTo(6f, 21f)
            }
}

public val LucideIcons.All.ImageMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageMinus: ImageVector
    @Composable get() = ImageMinusDefinition.asImageVector()
