package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarFold") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 20f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, 1.706f, -.706f)
                lineToRelative(3.588f, -3.588f)
                arcTo(2.4f, 2.4f, 0f, false, false, 21f, 16f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 22f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.CalendarFoldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarFold: ImageVector
    @Composable get() = CalendarFoldDefinition.asImageVector()
