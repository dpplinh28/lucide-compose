package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PictureInPicture") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                horizontalLineToRelative(6f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 4f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 10f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-7f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 14f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.PictureInPictureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PictureInPicture: ImageVector
    @Composable get() = PictureInPictureDefinition.asImageVector()
