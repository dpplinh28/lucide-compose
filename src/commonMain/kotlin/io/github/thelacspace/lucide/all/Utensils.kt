package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Utensils") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                verticalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15f)
                verticalLineTo(2f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, .9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(7f)
            }
}

public val LucideIcons.All.UtensilsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Utensils: ImageVector
    @Composable get() = UtensilsDefinition.asImageVector()
