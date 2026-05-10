package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PackageX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 14.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 19.5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 10.5f)
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
                lineToRelative(.13f, -.074f)
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

public val LucideIcons.All.PackageXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PackageX: ImageVector
    @Composable get() = PackageXDefinition.asImageVector()
