package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BadgeRussianRuble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.85f, 8.62f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 6.74f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4.78f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 6.74f)
                arcToRelative(4f, 4f, 0f, false, true, -4.77f, 4.78f)
                arcToRelative(4f, 4f, 0f, false, true, -6.75f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, -4.78f, -4.77f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, -6.76f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 16f)
                horizontalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                horizontalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
            }
}

public val LucideIcons.All.BadgeRussianRubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BadgeRussianRuble: ImageVector
    @Composable get() = BadgeRussianRubleDefinition.asImageVector()
