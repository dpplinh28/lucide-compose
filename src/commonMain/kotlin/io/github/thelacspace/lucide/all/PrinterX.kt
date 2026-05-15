package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PrinterX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.531f, 22f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(6.377f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 16.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 21.5f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.PrinterXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PrinterX: ImageVector
    @Composable get() = PrinterXDefinition.asImageVector()
