package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Birdhouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 18f)
                lineToRelative(1.956f, -11.468f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3f, 8f)
                lineToRelative(7.82f, -5.615f)
                arcToRelative(2f, 2f, 0f, false, true, 2.36f, 0f)
                lineTo(21f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 18f)
                lineTo(5.044f, 6.532f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.BirdhouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Birdhouse: ImageVector
    @Composable get() = BirdhouseDefinition.asImageVector()
