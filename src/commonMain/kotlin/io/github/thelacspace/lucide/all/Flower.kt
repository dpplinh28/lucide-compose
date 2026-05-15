package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16.5f)
                arcTo(4.5f, 4.5f, 0f, true, true, 7.5f, 12f)
                arcTo(4.5f, 4.5f, 0f, true, true, 12f, 7.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, 4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, -4.5f, 4.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7.5f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 12f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f, 12f)
                horizontalLineTo(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 16.5f)
                verticalLineTo(15f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 8f)
                lineToRelative(1.88f, 1.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f, 9.88f)
                lineTo(16f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 16f)
                lineToRelative(1.88f, -1.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f, 14.12f)
                lineTo(16f, 16f)
            }
}

public val LucideIcons.All.FlowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flower: ImageVector
    @Composable get() = FlowerDefinition.asImageVector()
