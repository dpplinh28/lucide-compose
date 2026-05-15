package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Package") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 21.73f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 0f)
                lineToRelative(7f, -4f)
                arcTo(2f, 2f, 0f, false, false, 21f, 16f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -1f, -1.73f)
                lineToRelative(-7f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 0f)
                lineToRelative(-7f, 4f)
                arcTo(2f, 2f, 0f, false, false, 3f, 8f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 1f, 1.73f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.29f, 7f)
                lineTo(12f, 12f)
                lineTo(20.71f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.5f, 4.27f)
                lineToRelative(9f, 5.15f)
            }
}

public val LucideIcons.All.PackageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Package: ImageVector
    @Composable get() = PackageDefinition.asImageVector()
