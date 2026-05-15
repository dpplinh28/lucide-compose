package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NavigationOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.43f, 8.43f)
                lineTo(3f, 11f)
                lineToRelative(8f, 2f)
                lineToRelative(2f, 8f)
                lineToRelative(2.57f, -5.43f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.39f, 11.73f)
                lineTo(22f, 2f)
                lineToRelative(-9.73f, 4.61f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
}

public val LucideIcons.All.NavigationOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NavigationOff: ImageVector
    @Composable get() = NavigationOffDefinition.asImageVector()
