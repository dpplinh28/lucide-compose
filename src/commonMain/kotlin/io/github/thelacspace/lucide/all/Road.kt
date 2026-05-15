package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Road") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 9f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.077f, 18.449f)
                arcTo(2f, 2f, 0f, false, false, 4f, 21f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 1.924f, -2.55f)
                lineToRelative(-4f, -14f)
                arcTo(2f, 2f, 0f, false, false, 16f, 3f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -1.924f, 1.45f)
                close()
            }
}

public val LucideIcons.All.RoadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Road: ImageVector
    @Composable get() = RoadDefinition.asImageVector()
