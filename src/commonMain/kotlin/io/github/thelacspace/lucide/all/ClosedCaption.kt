package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClosedCaption") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 9.17f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 5.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 9.17f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 5.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 5.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.ClosedCaptionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClosedCaption: ImageVector
    @Composable get() = ClosedCaptionDefinition.asImageVector()
