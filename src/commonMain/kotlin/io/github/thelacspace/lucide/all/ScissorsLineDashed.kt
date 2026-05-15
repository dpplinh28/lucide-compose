package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScissorsLineDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.42f, 9.42f)
                lineTo(8f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 6f)
                lineToRelative(-8.58f, 8.58f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.8f, 14.8f)
                lineTo(14f, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-2f)
            }
}

public val LucideIcons.All.ScissorsLineDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScissorsLineDashed: ImageVector
    @Composable get() = ScissorsLineDashedDefinition.asImageVector()
