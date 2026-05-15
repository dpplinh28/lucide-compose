package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 10.27f)
                lineTo(7f, 3.34f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(11f, 13.73f)
                lineToRelative(-4f, 6.93f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 22f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 20.66f)
                lineToRelative(-1f, -1.73f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 3.34f)
                lineToRelative(-1f, 1.73f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.66f, 17f)
                lineToRelative(-1.73f, -1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.66f, 7f)
                lineToRelative(-1.73f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3.34f, 17f)
                lineToRelative(1.73f, -1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3.34f, 7f)
                lineToRelative(1.73f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, 16.0f, 0f)
                arcToRelative(8.0f, 8.0f, 0f, true, false, -16.0f, 0f)
            }
}

public val LucideIcons.All.CogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cog: ImageVector
    @Composable get() = CogDefinition.asImageVector()
