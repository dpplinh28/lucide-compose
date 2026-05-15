package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EarthLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 3.34f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 21.95f)
                verticalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(2.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.54f, 15f)
                horizontalLineTo(17f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4.54f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                arcToRelative(10f, 10f, 0f, true, false, 9.54f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.EarthLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EarthLock: ImageVector
    @Composable get() = EarthLockDefinition.asImageVector()
