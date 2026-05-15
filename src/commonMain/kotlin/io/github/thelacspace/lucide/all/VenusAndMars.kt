package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VenusAndMars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 20f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 2f)
                lineToRelative(-5.46f, 5.46f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
}

public val LucideIcons.All.VenusAndMarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VenusAndMars: ImageVector
    @Composable get() = VenusAndMarsDefinition.asImageVector()
