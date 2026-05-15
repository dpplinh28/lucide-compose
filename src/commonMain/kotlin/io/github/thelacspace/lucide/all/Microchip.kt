package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Microchip") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 17f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 7f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 18f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 6f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MicrochipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Microchip: ImageVector
    @Composable get() = MicrochipDefinition.asImageVector()
