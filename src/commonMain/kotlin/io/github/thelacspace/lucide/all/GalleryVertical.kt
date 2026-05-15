package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 2f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 6.0f)
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
            lucidePath(strokeWidth) {
                moveTo(3f, 22f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.GalleryVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryVertical: ImageVector
    @Composable get() = GalleryVerticalDefinition.asImageVector()
