package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.2f, 4.2f)
                arcTo(2f, 2f, 0f, false, false, 3f, 6f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 1.82f, -1.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15.5f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 10f)
                horizontalLineToRelative(-5.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.CalendarOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarOff: ImageVector
    @Composable get() = CalendarOffDefinition.asImageVector()
