package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinHouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 22f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, .445f, -.832f)
                lineToRelative(3f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 1.11f, 0f)
                lineToRelative(3f, 2f)
                arcTo(1f, 1f, 0f, false, true, 22f, 17f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
                curveToRelative(0f, 4.993f, 5.539f, 10.193f, 7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, false, .601f, .2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.MapPinHouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinHouse: ImageVector
    @Composable get() = MapPinHouseDefinition.asImageVector()
