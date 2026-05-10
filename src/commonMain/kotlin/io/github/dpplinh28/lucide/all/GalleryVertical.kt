package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

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
