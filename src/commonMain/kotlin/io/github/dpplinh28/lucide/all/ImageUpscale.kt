package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageUpscale") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 21f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 21f)
                lineToRelative(4.144f, -4.144f)
                arcToRelative(1.21f, 1.21f, 0f, false, true, 1.712f, 0f)
                lineTo(13f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.ImageUpscaleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageUpscale: ImageVector
    @Composable get() = ImageUpscaleDefinition.asImageVector()
