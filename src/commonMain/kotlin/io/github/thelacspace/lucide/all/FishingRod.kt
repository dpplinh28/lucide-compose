package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishingRod") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 11f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(.5f)
                curveTo(14f, 2f, 20f, 9f, 20f, 18f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.FishingRodDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishingRod: ImageVector
    @Composable get() = FishingRodDefinition.asImageVector()
