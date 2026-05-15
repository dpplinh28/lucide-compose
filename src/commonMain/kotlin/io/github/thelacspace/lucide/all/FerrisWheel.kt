package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FerrisWheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.8f, 15f)
                lineToRelative(-3.5f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.7f, 7f)
                lineToRelative(-3.5f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.8f, 9f)
                lineTo(3.3f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.7f, 17f)
                lineToRelative(-3.5f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 22f)
                lineToRelative(3f, -8f)
                lineToRelative(3f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 18.7f)
                arcToRelative(9f, 9f, 0f, true, false, -12f, 0f)
            }
}

public val LucideIcons.All.FerrisWheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FerrisWheel: ImageVector
    @Composable get() = FerrisWheelDefinition.asImageVector()
