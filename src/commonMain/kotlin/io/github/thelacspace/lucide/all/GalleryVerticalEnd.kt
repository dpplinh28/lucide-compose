package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryVerticalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 6f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.GalleryVerticalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryVerticalEnd: ImageVector
    @Composable get() = GalleryVerticalEndDefinition.asImageVector()
