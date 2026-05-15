package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Columns3Cog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.3f, 19.6f)
                lineToRelative(1f, -.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 3f)
                verticalLineToRelative(7.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.2f, 16.9f)
                lineToRelative(-.9f, -.3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.6f, 21.7f)
                lineToRelative(.3f, -.9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.8f, 15.3f)
                lineToRelative(-.4f, -1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.1f, 15.2f)
                lineToRelative(.3f, -.9f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.6f, 21.7f)
                lineToRelative(-.4f, -1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.7f, 16.8f)
                lineToRelative(1f, -.4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.7f, 19.4f)
                lineToRelative(-.9f, -.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.Columns3CogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Columns3Cog: ImageVector
    @Composable get() = Columns3CogDefinition.asImageVector()
