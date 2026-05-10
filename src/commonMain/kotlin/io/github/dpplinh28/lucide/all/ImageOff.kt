package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.41f, 10.41f)
                arcToRelative(2f, 2f, 0f, true, true, -2.83f, -2.83f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f, 13.5f)
                lineTo(6f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                lineTo(21f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.59f, 3.59f)
                arcTo(1.99f, 1.99f, 0f, false, false, 3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(.55f, 0f, 1.052f, -.22f, 1.41f, -.59f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(9f)
            }
}

public val LucideIcons.All.ImageOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageOff: ImageVector
    @Composable get() = ImageOffDefinition.asImageVector()
