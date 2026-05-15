package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Boxes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.97f, 12.92f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14.63f)
                verticalLineToRelative(3.24f)
                arcToRelative(2f, 2f, 0f, false, false, .97f, 1.71f)
                lineToRelative(3f, 1.8f)
                arcToRelative(2f, 2f, 0f, false, false, 2.06f, 0f)
                lineTo(12f, 19f)
                verticalLineToRelative(-5.5f)
                lineToRelative(-5f, -3f)
                lineToRelative(-4.03f, 2.42f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 16.5f)
                lineToRelative(-4.74f, -2.85f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 16.5f)
                lineToRelative(5f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 16.5f)
                verticalLineToRelative(5.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 13.5f)
                verticalLineTo(19f)
                lineToRelative(3.97f, 2.38f)
                arcToRelative(2f, 2f, 0f, false, false, 2.06f, 0f)
                lineToRelative(3f, -1.8f)
                arcToRelative(2f, 2f, 0f, false, false, .97f, -1.71f)
                verticalLineToRelative(-3.24f)
                arcToRelative(2f, 2f, 0f, false, false, -.97f, -1.71f)
                lineTo(17f, 10.5f)
                lineToRelative(-5f, 3f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 16.5f)
                lineToRelative(-5f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 16.5f)
                lineToRelative(4.74f, -2.85f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 16.5f)
                verticalLineToRelative(5.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.97f, 4.42f)
                arcTo(2f, 2f, 0f, false, false, 7f, 6.13f)
                verticalLineToRelative(4.37f)
                lineToRelative(5f, 3f)
                lineToRelative(5f, -3f)
                verticalLineTo(6.13f)
                arcToRelative(2f, 2f, 0f, false, false, -.97f, -1.71f)
                lineToRelative(-3f, -1.8f)
                arcToRelative(2f, 2f, 0f, false, false, -2.06f, 0f)
                lineToRelative(-3f, 1.8f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                lineTo(7.26f, 5.15f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(12f, 8f)
                lineToRelative(4.74f, -2.85f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 13.5f)
                verticalLineTo(8f)
            }
}

public val LucideIcons.All.BoxesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Boxes: ImageVector
    @Composable get() = BoxesDefinition.asImageVector()
