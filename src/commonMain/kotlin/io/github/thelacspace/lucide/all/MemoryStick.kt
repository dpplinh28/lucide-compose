package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MemoryStick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 18f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 11f)
                horizontalLineToRelative(1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 18f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5f, 11f)
                horizontalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 18f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MemoryStickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MemoryStick: ImageVector
    @Composable get() = MemoryStickDefinition.asImageVector()
