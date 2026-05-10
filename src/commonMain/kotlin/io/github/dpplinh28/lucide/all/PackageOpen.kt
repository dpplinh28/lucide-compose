package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PackageOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.17f, 2.21f)
                arcToRelative(1.67f, 1.67f, 0f, false, true, 1.63f, 0f)
                lineTo(21f, 4.57f)
                arcToRelative(1.93f, 1.93f, 0f, false, true, 0f, 3.36f)
                lineTo(8.82f, 14.79f)
                arcToRelative(1.655f, 1.655f, 0f, false, true, -1.64f, 0f)
                lineTo(3f, 12.43f)
                arcToRelative(1.93f, 1.93f, 0f, false, true, 0f, -3.36f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                verticalLineToRelative(3.87f)
                arcToRelative(2.06f, 2.06f, 0f, false, true, -1.11f, 1.83f)
                lineToRelative(-6f, 3.08f)
                arcToRelative(1.93f, 1.93f, 0f, false, true, -1.78f, 0f)
                lineToRelative(-6f, -3.08f)
                arcTo(2.06f, 2.06f, 0f, false, true, 4f, 16.87f)
                verticalLineTo(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12.43f)
                arcToRelative(1.93f, 1.93f, 0f, false, false, 0f, -3.36f)
                lineTo(8.83f, 2.2f)
                arcToRelative(1.64f, 1.64f, 0f, false, false, -1.63f, 0f)
                lineTo(3f, 4.57f)
                arcToRelative(1.93f, 1.93f, 0f, false, false, 0f, 3.36f)
                lineToRelative(12.18f, 6.86f)
                arcToRelative(1.636f, 1.636f, 0f, false, false, 1.63f, 0f)
                close()
            }
}

public val LucideIcons.All.PackageOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PackageOpen: ImageVector
    @Composable get() = PackageOpenDefinition.asImageVector()
