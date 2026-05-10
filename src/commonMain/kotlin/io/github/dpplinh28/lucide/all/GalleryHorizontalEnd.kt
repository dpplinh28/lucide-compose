package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryHorizontalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 7f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 5f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.GalleryHorizontalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryHorizontalEnd: ImageVector
    @Composable get() = GalleryHorizontalEndDefinition.asImageVector()
