package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PackageCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 17f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 11.127f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -1f, -1.73f)
                lineToRelative(-7f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 0f)
                lineToRelative(-7f, 4f)
                arcTo(2f, 2f, 0f, false, false, 3f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 1f, 1.729f)
                lineToRelative(7f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, .001f)
                lineToRelative(1.32f, -.753f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.29f, 7f)
                lineTo(12f, 12f)
                lineToRelative(8.71f, -5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.5f, 4.27f)
                lineToRelative(8.997f, 5.148f)
            }
}

public val LucideIcons.All.PackageCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PackageCheck: ImageVector
    @Composable get() = PackageCheckDefinition.asImageVector()
